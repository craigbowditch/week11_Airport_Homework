import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {

    private Hangar hangar;
    private Plane plane;

    @Before
    public void before(){
        hangar = new Hangar("hangar 1");
        plane = new Plane(PlaneType.BOEING747, Airline.BRITISHAIRWAYS);
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
        hangar.addPlane(plane);
        assertEquals(2, hangar.planeCount());
        hangar.removePlane(plane);
        assertEquals(1, hangar.planeCount());
    }
}
