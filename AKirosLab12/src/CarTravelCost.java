import java.util.*;

public class CarTravelCost implements TravelCost {
    // Attributes
    private int numMiles;
    private double hotelCost;
    private String destination;

    // Constructor
    public CarTravelCost(int _miles, double _hotel, String _place) {
        numMiles = _miles;
        hotelCost = _hotel;
        destination = _place;
    }

    // Accessor
    public String getDestination() {
        return destination;
    }
    public double getDuration() {
        final double numHours;
        numHours = (double)numMiles/65;
        return numHours;
    }
    public double getLodgingCost() {
        final double numDays;
        numDays = Math.floor( getDuration()/8.0 );
        return numDays*hotelCost;
    }
    public double getTotalCost() {
        return (numMiles * 0.45) + getLodgingCost() + AGENT_FEE;
    }
    public String toString() {
        return ( "Car travel to " + String.format("%s", getDestination()) + " will take " + String.format("%.2f", getDuration()) + " hours and cost $ " + String.format("%.2f", getTotalCost()) );
    }


}

