package mediator;

public interface FlightMediator {
    void bookFlight(int flightNumber, String passengerName);
    void cancelBooking(int flightNumber, String passengerName);
}
