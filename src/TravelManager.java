
public class TravelManager {

    public static void main(String args[]) throws Exception {

        Airline myAirline = new Airline("Stuff");
        Airport originAirport = new Airport("ABC");
        Airport destinationAirport = new Airport("DEF");

        Flight myFlight = new Flight(myAirline, originAirport, destinationAirport);

        System.out.print(myFlight);

    }
}
