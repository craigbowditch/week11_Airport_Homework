import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {


    private Booking booking;
    private Flight flight;
    private Passenger passenger;
    private Plane plane;

    @Before
    public void before(){
        flight = new Flight(plane, "BA99", AirportCode.JFK);
        passenger = new Passenger("Thomson");
        booking = new Booking(flight, passenger);
    }

    @Test
    public void hasFlight() {
        assertEquals(flight, booking.getFlight());
    }

    @Test
    public void hasPassenger() {
        assertEquals(passenger, booking.getPassenger());
    }
}
