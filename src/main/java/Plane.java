import java.util.ArrayList;

public class Plane {

    private PlaneType planeType;
    private Airline airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType planeType, Airline airline) {
        this.planeType = planeType;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public Airline getAirline() {
        return airline;
    }

    public int getCapacity() {
        return planeType.getCapacity();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if ( passengerCount() < planeType.getCapacity())
        this.passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        this.passengers.remove(passenger);
    }
}
