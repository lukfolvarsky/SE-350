public class ProxyFlightManager extends FlightManager {

    private static FlightManager realObject;

    public static CommercialFlight getFlightByNumber(String flightNum) throws Exception {
        System.out.println("Flight number: " + flightNum + " is being retrieved.");

        return realObject.getFlightByNumber(flightNum);
    }

    public static CommercialFlight createFlight(String type, Airline airline, Airport origin, Airport destination, String flightNum, Integer passengerCapacity) throws Exception {
        System.out.println("A flight is being created.");

        return realObject.createFlight(type, airline, origin, destination, flightNum, passengerCapacity);
    }
}


