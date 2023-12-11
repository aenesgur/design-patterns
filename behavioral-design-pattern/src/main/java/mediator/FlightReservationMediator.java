package mediator;

import java.util.HashMap;
import java.util.Map;

public class FlightReservationMediator implements FlightMediator {
    private Map<Integer, Flight> flights = new HashMap<>();

    public void addFlight(Flight flight) {
        flights.put(flight.getFlightNumber(), flight);
    }

    @Override
    public void bookFlight(int flightNumber, String passengerName) {
        if (flights.containsKey(flightNumber)) {
            flights.get(flightNumber).bookSeat(passengerName);
        } else {
            System.out.println("Flight " + flightNumber + " not found.");
        }
    }

    @Override
    public void cancelBooking(int flightNumber, String passengerName) {
        if (flights.containsKey(flightNumber)) {
            flights.get(flightNumber).cancelBooking(passengerName);
        } else {
            System.out.println("Flight " + flightNumber + " not found.");
        }
    }
}
