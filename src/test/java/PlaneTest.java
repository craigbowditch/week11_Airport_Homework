import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

   private Plane plane;
   private Passenger passenger;

   @Before
    public void before(){
       plane = new Plane(PlaneType.BOEING747, Airline.BRITISHAIRWAYS);
       passenger = new Passenger("Smith");
   }

    @Test
    public void hasPlaneType() {
       assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void hasAirline() {
       assertEquals(Airline.BRITISHAIRWAYS, plane.getAirline());
    }

    @Test
    public void hasCapacity() {
       assertEquals(416, plane.getCapacity());
    }

    @Test
    public void startsWithNoPassengers() {
       assertEquals(0, plane.passengerCount());
    }

    @Test
    public void canAddPassenger() {
       plane.addPassenger(passenger);
       assertEquals(1, plane.passengerCount());
    }

    @Test
    public void cantAddPassengersPastCapacity() {
      Plane newPlane = new Plane(PlaneType.BOEING777, Airline.AMERICANAIRLINES);
      newPlane.addPassenger(passenger);
      newPlane.addPassenger(passenger);
        assertEquals(2, newPlane.passengerCount());
        newPlane.addPassenger(passenger);
      assertEquals(2, newPlane.passengerCount());
    }

    @Test
    public void canRemovePassenger() {
       plane.addPassenger(passenger);
       plane.addPassenger(passenger);
       assertEquals(2, plane.passengerCount());
       plane.removePassenger(passenger);
       assertEquals(1, plane.passengerCount());
    }
}
