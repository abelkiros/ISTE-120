import java.util.*;

public class AirTravelCost implements TravelCost {
    // Attributes
    private String arrDate;
    private String arrTime;
    private String depDate;
    private String depTime;
    private String destination;
    private double travelFare;
    private double hotelCost;

    // Constructor
    public AirTravelCost(String _arrDate, String _arrTime, String _depDate, String _depTime, String _place, double _fare, double _hotel) {
        arrDate = _arrDate;
        arrTime = _arrTime;
        depDate = _depDate;
        depTime = _depTime;
        destination = _place;
        travelFare = _fare;
        hotelCost = _hotel;
    }

    // Accessor
    public String getDestination() {
        return destination;
    }
    public double getDuration() {
        GregorianCalendar arrival = new GregorianCalendar(
                Integer.parseInt(arrDate.substring(0,4)),
                Integer.parseInt(arrDate.substring(4,6)),
                Integer.parseInt(arrDate.substring(6)),
                Integer.parseInt(arrTime.substring(0,2)),
                Integer.parseInt(arrTime.substring(2)));
        GregorianCalendar departure = new GregorianCalendar(
                Integer.parseInt(depDate.substring(0,4)),
                Integer.parseInt(depDate.substring(4,6)),
                Integer.parseInt(depDate.substring(6)),
                Integer.parseInt(depTime.substring(0,2)),
                Integer.parseInt(depTime.substring(2))
        );

        long milli;
        milli = arrival.getTimeInMillis() - departure.getTimeInMillis();

        return ((double) (milli/60000) /60);
    }
    public double getLodgingCost() {
        return (Math.floor(getDuration()/24) * hotelCost);
    }
    public double getTotalCost() {
        return travelFare + getLodgingCost() + AGENT_FEE;
    }
    public String toString() {
        return ("Air travel to " + String.format("%s", getDestination()) + " will take " + String.format("%.2f", getDuration()) + " hours and" + " cost $ " + getTotalCost());
    }
}