import java.util.*;

public class TestCarTravelCost {
    public static void main(String[] args) {
        // Variables
        String userInputs;
        String[] userInputsSplit;
        // Car Travel
        int _miles;
        double _hotel;
        String _place;
        // Train Travel
        double _time;
        double _trainFare;
        // Air Travel
        double _airFare;
        String _depDate;
        String _depTime;
        String _arrDate;
        String _arrTime;

        // Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Miles, Hotel Cost per Night, Destination, Train Duration, Train Fare, Air Fare, Departure Date, Departure Time, Arrival Date, Arrival Time): ");
        userInputs = input.nextLine();
        userInputsSplit = userInputs.split(" ");

        // Error handling: Less than 5 inputs
        if(userInputsSplit.length < 10) {
            System.out.println("ERROR: Invalid number of command line arguments");
            System.exit(0);
        };

        // Parse the inputs
        _miles = Integer.parseInt(userInputsSplit[0]);
        _hotel = Double.parseDouble(userInputsSplit[1]);
        _place = userInputsSplit[2];
        _time = Double.parseDouble(userInputsSplit[3]);
        _trainFare = Double.parseDouble(userInputsSplit[4]);
        _airFare = Double.parseDouble(userInputsSplit[5]);
        _depDate = userInputsSplit[6];
        _depTime = userInputsSplit[7];
        _arrDate = userInputsSplit[8];
        _arrTime = userInputsSplit[9];

        // Create Object CarTravelCost
        CarTravelCost car = new CarTravelCost(_miles, _hotel, _place);
        // Create Object TrainTravelCost
        TrainTravelCost train = new TrainTravelCost(_time, _trainFare, _place);
        // Create Object AirTravelCost
        AirTravelCost air = new AirTravelCost(_arrDate, _arrTime, _depDate, _depTime, _place, _airFare, _hotel);

        // Arraylist
        ArrayList<TravelCost> travels = new ArrayList<TravelCost>();
        travels.add(car);
        travels.add(train);
        travels.add(air);

        // Temp Low Variables
        double lowCost = travels.get(0).getTotalCost();
        double lowRide = travels.get(0).getDuration();
        String lowString = travels.get(0).toString();

        // Output
        System.out.println(car.toString());
        System.out.println(train.toString());
        System.out.println(air.toString());
        System.out.println();

        // Look for lowest cost
        for(int i=0; i<travels.size(); i++) {
            if(travels.get(i).getTotalCost() < lowCost) {
                lowCost = travels.get(i).getTotalCost();
                lowString = travels.get(i).toString();
            }
        };

        System.out.println("LOWEST COST: " + lowString);

        // Look for shortest ride
        for(int i=0; i<travels.size(); i++) {
            if(travels.get(i).getDuration() < lowRide) {
                lowRide = travels.get(i).getDuration();
                lowString = travels.get(i).toString();
            }
        };

        System.out.println("SHORTEST RIDE: " + lowString);

        // Test Input: 400 200 Boston 11 60 224 20140503 0743 20140503 1153
    }
}

