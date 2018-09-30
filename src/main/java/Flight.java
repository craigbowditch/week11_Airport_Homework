public class Flight {

    private Plane plane;
    private String flightNumber;
    private AirportCode destination;

    public Flight(Plane plane, String flightNumber, AirportCode destination) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public AirportCode getDestination() {
        return destination;
    }
}
