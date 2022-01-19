import java.util.Objects;

public class Airline {

    private String AirlineName;

    public Airline(String name) throws Exception{
        setAirlineName(name);
    }

    public String getAirlineName() {
        return AirlineName;
    }

    private void setAirlineName(String name) throws Exception {
        if (name.length() >= 8) {
            throw new Exception("Requirements were not met for Airline name. Must be less than 8 characters.");
        }
        AirlineName = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final Airline other = (Airline) obj;
        if (!getAirlineName().equals(other.getAirlineName())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(getAirlineName()));
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(AirlineName);
    }

}
