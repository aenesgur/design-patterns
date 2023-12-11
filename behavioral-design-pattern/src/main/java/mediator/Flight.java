package mediator;

import java.util.HashSet;
import java.util.Set;

public class Flight {
    private int flightNumber;
    private Set<String> bookedSeats = new HashSet<>();

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void bookSeat(String passengerName) {
        bookedSeats.add(passengerName);
        System.out.println("Seat booked for " + passengerName + " on Flight " + flightNumber);
    }

    public void cancelBooking(String passengerName) {
        if (bookedSeats.remove(passengerName)) {
            System.out.println("Booking canceled for " + passengerName + " on Flight " + flightNumber);
        } else {
            System.out.println("Passenger " + passengerName + " not found on Flight " + flightNumber);
        }
    }
}
