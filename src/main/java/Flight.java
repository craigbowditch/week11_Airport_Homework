public class Flight {

    private Plane plane;
    private String flightNumber;
    private AirportCode destination;
    private int ticketCount;

    public Flight(Plane plane, String flightNumber, AirportCode destination) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.ticketCount = 0;
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

    public int getTicketCount() {
        return this.ticketCount;
    }

    public void addTicket() {
        this.ticketCount += 1;
    }
}
