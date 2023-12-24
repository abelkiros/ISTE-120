public class TrainTravelCost implements TravelCost {
    // Attributes
    private double duration;
    private double trainFare;
    private String destination;

    // Constructor
    public TrainTravelCost(double _time, double _fare, String _place) {
        duration = _time;
        trainFare = _fare;
        destination = _place;
    }

    // Accessor
    public double getDuration() {
        return duration;
    }
    public String getDestination() {
        return destination;
    }
    public double getLodgingCost() {
        return 0.0;
    }
    public double getTotalCost() {
        return trainFare + AGENT_FEE;
    }
    public String toString() {
        return ("Train travel to " + String.format("%s", getDestination()) + " will take " + String.format("%.2f", getDuration()) + " hours and cost $ " + String.format("%.2f", getTotalCost()));
    }

}