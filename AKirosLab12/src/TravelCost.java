public interface TravelCost
{
    final double AGENT_FEE = 10.00;

    // Methods
    double getDuration();
    double getTotalCost();
    double getLodgingCost();
    String getDestination();
    String toString();
}