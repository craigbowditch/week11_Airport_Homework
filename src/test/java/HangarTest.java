import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {

    private Hangar hangar;
    private Plane plane;
    private Plane plane2;

    @Before
    public void before(){
        hangar = new Hangar("hangar 1");
        plane = new Plane(PlaneType.BOEING747, Airline.BRITISHAIRWAYS);
        plane2 = new Plane(PlaneType.BOEING777, Airline.EASYJET);
    }

    @Test
    public void hasName() {
        assertEquals("hangar 1", hangar.getName());
    }

    @Test
    public void startsWithNoPlanes() {
        assertEquals(0, hangar.planeCount());
    }

    @Test
    public void canAddPlaneToHangar() {
        hangar.addPlane(plane);
        assertEquals(1, hangar.planeCount());
    }

    @Test
    public void canRemovePlaneFromHangar() {
        hangar.addPlane(plane);
        hangar.addPlane(plane2);
        assertEquals(2, hangar.planeCount());
        hangar.removePlane(plane2);
        assertEquals(1, hangar.planeCount());
        assert(!hangar.containsPlane(plane2));

    }
}
