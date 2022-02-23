
import java.util.HashMap;
import java.util.Map;

public class AirportFactory {

    private static Map<String, Airport> vehicleCache = new HashMap<>();

    private AirportFactory() {}

    public static Airport getAirport(String airportName) {
        return vehicleCache.computeIfAbsent(airportName, newAirport -> {
            try {
                return new Airport(newAirport);
            }
            catch(Exception E){
                System.out.println("error");
            }
            //throw new Exception("Requirements were not met for Airport name. Must be 3 UPPERCASE characters.");
            return null;
        });
    }
}
