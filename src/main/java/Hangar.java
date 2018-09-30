import java.util.ArrayList;

public class Hangar {

    private ArrayList<Plane> planes;
    private String name;

    public Hangar(String name) {
        this.planes = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int planeCount() {
        return this.planes.size();
    }

    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }


    public Plane removePlane(Plane plane) {
        return this.planes.remove(this.planes.indexOf(plane));

    }

    public boolean containsPlane(Plane selectedPlane) {
        for (Plane plane : planes) {
            if (plane == selectedPlane) {
                return true;
            }
        }
        return false;
    }
}
