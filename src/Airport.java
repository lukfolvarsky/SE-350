import java.util.Objects;

public class Airport {

    private String AirportName;

    public Airport(String name) throws Exception{
        setAirportName(name);
    }

    private void setAirportName(String name) throws Exception {
        if (name.length() != 3 || name.equals(name.toUpperCase())==false || name.matches(".*\\d.*")) {
            throw new Exception("Requirements were not met for Airport name. Must be 3 UPPERCASE characters.");
        }
        AirportName = name;
    }

    public String getAirportName() {
        return AirportName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final Airport other = (Airport) obj;
        if (!getAirportName().equals(other.getAirportName())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(getAirportName()));
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(AirportName);
    }

}
