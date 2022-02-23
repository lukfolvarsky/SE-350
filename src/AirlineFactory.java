

import java.util.HashMap;
import java.util.Map;

public class AirlineFactory {

    private static Map<String, Airline> vehicleCache = new HashMap<>();

    private AirlineFactory() {}

    public static Airline getAirline(String airlineName) {
        return vehicleCache.computeIfAbsent(airlineName, newAirline -> {
            try {
                return new Airline(newAirline);
            }
            catch(Exception E){
                System.out.println("error");
            }
            //throw new Exception("Requirements were not met for Airport name. Must be 3 UPPERCASE characters.");
            return null;
        });
    }
}
