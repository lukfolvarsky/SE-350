import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.UUID;


public class Flight {

    private String flightNumber;
    private LocalDateTime departureTime;
    private Airline airline;
    private Airport origin;
    private Airport destination;


    public Flight(Airline airline, Airport origin,Airport destination/*,String flightNum, LocalDate departTime*/) throws Exception{
        //Airline.setAirlineName(airline);
        //Airport.setAirportName(origin);
        //Airport.setAirportName(destination);
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;


        setFlightNumber(String.valueOf(UUID.randomUUID()));
        setDepartureTime(LocalDateTime.now());
    }

    private void setFlightNumber(String flightNum) throws Exception {
        if (flightNum == null) {
            throw new Exception("Requirements were not met for Flight Number");
        }
        flightNumber = flightNum;
    }

    private void setDepartureTime(LocalDateTime departTime) throws Exception {
        if (departTime == null) {
            throw new Exception("Requirements were not met for Departure Time");
        }
        departureTime = departTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
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
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Flight flight = (Flight) obj;
        return flightNumber.equals(flight.flightNumber) && departureTime.equals(flight.departureTime) && airline.equals(flight.airline) && origin.equals(flight.origin) && destination.equals(flight.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, departureTime, airline, origin, destination);
    }

}
