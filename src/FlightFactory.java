

public class FlightFactory {

    private Airline airline;
    private Airport origin;
    private Airport destination;
    private String type;
    private String flightNum;


    public FlightFactory(String type) throws Exception{
        setType(type);
    }

    public static CommercialFlight createFlight(String type, Airline airline, Airport origin, Airport destination, String flightNum,Integer passengerCapacity) throws Exception {
        //System.out.println(type+ "------XXX-----");
        if (type.equals("CommercialFlight")) {
            return new CommercialFlight(airline, origin, destination, flightNum);
        }
        else if (type.equals("PassengerFlight")) {
            return new PassengerFlight(airline, origin, destination, flightNum,passengerCapacity);

        }
        else return null;
    }

    private void setType(String type) throws Exception {
        if (type == null) {
            throw new Exception("Airline can't be null.");
        }
        this.type = type;
    }

}
