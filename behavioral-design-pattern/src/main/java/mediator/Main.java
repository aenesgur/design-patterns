package mediator;

public class Main {
    public static void main(String[] args) {
        FlightReservationMediator mediator = new FlightReservationMediator();

        Flight flight1 = new Flight(101);
        Flight flight2 = new Flight(202);

        mediator.addFlight(flight1);
        mediator.addFlight(flight2);

        mediator.bookFlight(101, "John Doe");
        mediator.bookFlight(202, "Jane Doe");

        mediator.cancelBooking(101, "John Doe");
    }
}
