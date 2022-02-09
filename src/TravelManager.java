
public class TravelManager {

    public static void main(String args[]) throws Exception {

        Airline myAirline = new Airline("Stuff");
        Airport originAirport = new Airport("ABC");
        Airport destinationAirport = new Airport("DEF");
        String type= ("CommercialFlight");
        String flightNum=("87459342");
        String flightNum2=("293478234");
        String flightNotExist=("342341245");

        //CommercialFlight myFlight = new CommercialFlight(myAirline, originAirport, destinationAirport,flightNum);

        //System.out.print(myFlight);

        /*Creates two flights and stores them in list.*/
        FlightManager.createFlight(type,myAirline,originAirport,destinationAirport,flightNum);
        FlightManager.createFlight(type,myAirline,originAirport,destinationAirport,flightNum2);

        /*Checks to see if flight exists. If it exists then return the flight info.*/
        FlightManager.getFlightByNumber(flightNum);
        FlightManager.getFlightByNumber(flightNum2);

        /*This one does not exist*/
        FlightManager.getFlightByNumber(flightNotExist);
    }
}
