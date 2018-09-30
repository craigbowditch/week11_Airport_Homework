import java.util.ArrayList;

public class Airport {

    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flights;
    private AirportCode airportCode;


    public Airport(AirportCode airportCode) {
        this.hangars = new ArrayList<>();
        this.flights = new ArrayList<>();
        this.airportCode = airportCode;
    }

    public AirportCode getAirportCode() {
        return this.airportCode;
    }

    public int getFlightCount() {
        return this.flights.size();
    }

    public void createFlight(Plane plane, String flightNumber, AirportCode destination) {
        Flight newFlight = new Flight(plane, flightNumber, destination);
        this.flights.add(newFlight);
        assignPlaneFromHangar(plane);
    }

    public int hangarCount() {
        return this.hangars.size();
    }

    public void addHangar(Hangar hangar) {
        this.hangars.add(hangar);
    }

    public void assignPlaneFromHangar(Plane selectedPlane) {
        for (int i = 0; i < hangars.size(); i++) {
            if (hangars.get(i).containsPlane(selectedPlane)) {
                hangars.get(i).removePlane(selectedPlane);
            }
        }
    }
}