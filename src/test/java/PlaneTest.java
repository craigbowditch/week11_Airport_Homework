import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

   private Plane plane;

   @Before
    public void before(){
       plane = new Plane(PlaneType.BOEING747, Airline.BRITISHAIRWAYS);
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
}
