import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PassengerFlight extends CommercialFlight{

    private Integer passengerCapacity;

    private String flightNumber;
    private LocalDateTime departureTime;
    private Airline airline;
    private Airport origin;
    private Airport destination;


    public PassengerFlight(Airline airline, Airport origin, Airport destination, String flightNum, Integer passengerCapacity) throws Exception {
        super(airline,origin,destination,flightNum);
        setpassenger(passengerCapacity);
        this.airline = airline;
        this.origin=origin;
        this.flightNumber=flightNum;
        this.destination=destination;
        this.departureTime=LocalDateTime.now();
    }

    private void setpassenger(Integer passengerCapacity) throws Exception {
        if (passengerCapacity == null || passengerCapacity <=0) {
            throw new Exception("Passenger Capacity does not meet req.");
        }
        this.passengerCapacity= passengerCapacity;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        sb.append(String.format("%-20s %s%n", "Airline: ", airline));
        sb.append(String.format("%-20s %s%n", "Origin: ", origin));
        sb.append(String.format("%-20s %s%n", "Destination: ", destination));
        sb.append(String.format("%-20s %s%n", "Flight Number: ", flightNumber));
        sb.append(String.format("%-20s %s%n", "Departure Time: ", dtf.format(departureTime)));
        sb.append(String.format("%-20s %s%n", "Pas Cap: ", passengerCapacity));
        return sb.toString();
    }



}
//override tostring method



