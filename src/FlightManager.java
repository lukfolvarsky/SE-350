import java.util.ArrayList;
import java.util.List;

public class FlightManager {


    private static List<CommercialFlight> flights = new ArrayList<CommercialFlight>();

    public static CommercialFlight getFlightByNumber(String flightNum) throws Exception {
        System.out.println("This is flight num that was passed in from travelManager: "+ flightNum);
        int i =0;
        for (i = 0; i < flights.size(); i++)
        {
            if(flights.get(i).toString().contains(flightNum)==true) {
                System.out.println(flights.get(i));
                return flights.get(i);
            }
        }
            throw new Exception("Flight does not exist.");

    }

    public static CommercialFlight createFlight(String type, Airline airline, Airport origin, Airport destination,String flightNum) throws Exception{
        CommercialFlight x =FlightFactory.createFlight(type, airline, origin, destination, flightNum);
        flights.add(x);
            return x;
    }
}
