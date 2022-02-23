
public class TravelManager {

    public static void main(String args[]) throws Exception {

        //Airline myAirline = new Airline("Stuff");//

        Airline getAirline = AirlineFactory.getAirline("Stuff");

        //Airport originAirport = new Airport("ABC");

        Airport originAirport = AirportFactory.getAirport("ABC");

      //  Airport destinationAirport = new Airport("DEF");

        Airport destinationAirport = AirportFactory.getAirport("DEF");



        String CommercialFlight= ("CommercialFlight");
        String PassengerFlight= ("PassengerFlight");

        String flightNum=("87459342");
        String flightNum2=("293478234");

        String flightNotExist=("342341245");

        Integer cap=36;

        //CommercialFlight myFlight = new CommercialFlight(myAirline, originAirport, destinationAirport,flightNum);

        //System.out.print(myFlight);

        /*Creates two flights and stores them in list.*/
        FlightManager.createFlight(CommercialFlight,getAirline,originAirport,destinationAirport,flightNum,cap);
        //FlightManager.createFlight(type,getAirline,originAirport,destinationAirport,flightNum2,cap);

        FlightManager.createFlight(PassengerFlight,getAirline,originAirport,destinationAirport,flightNum2,cap);

        /*Checks to see if flight exists. If it exists then return the flight info.*/
        System.out.println(FlightManager.getFlightByNumber(flightNum));
        System.out.println(FlightManager.getFlightByNumber(flightNum2));

        /*This one does not exist*/
       // FlightManager.getFlightByNumber(flightNotExist);
    }
}
