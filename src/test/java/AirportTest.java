import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    private Airport airport;
    private Flight flight;
    private Plane plane;
    private Hangar hangar;
    private Booking booking;
    private Passenger passenger;

    @Before
    public void before(){
        airport = new Airport(AirportCode.GLA);
        plane = new Plane(PlaneType.BOEING747, Airline.BRITISHAIRWAYS);
        hangar = new Hangar("hangar 1");
        passenger = new Passenger("Smith");

    }

    @Test
    public void hasAirportCode() {
        assertEquals(AirportCode.GLA, airport.getAirportCode());
    }

    @Test
    public void startsWithNoFlights() {
        assertEquals(0, airport.getFlightCount());
    }

    @Test
    public void canCreateFlight() {
        airport.createFlight(plane, "BA99", AirportCode.JFK);
        assertEquals(1, airport.getFlightCount());
    }

    @Test
    public void hangarStartsEmpty() {
        assertEquals(0, airport.hangarCount());
    }

    @Test
    public void canAddHangarToAirport() {
        airport.addHangar(hangar);
        assertEquals(1, airport.hangarCount());
    }

    @Test
    public void airportCanAssignPlaneFromHangarToFlight() {
        airport.createFlight(plane, "BA99", AirportCode.JFK);
        airport.assignPlaneFromHangar(plane);
        assert(!hangar.containsPlane(plane));

    }

    @Test
    public void bookingsStartEmpty() {
        assertEquals(0, airport.bookingsCount());
    }

    @Test
    public void canMakeBooking() {
        airport.createBooking(flight, passenger);
        assertEquals(1, airport.bookingsCount());
    }
}
