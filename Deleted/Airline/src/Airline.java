public class Airline {
    String airlineName;
    int flightNumber;
    String destination;
    String departureTime;
    String arrivalTime;
    String aircraftModel;
    int capacity;
    double ticketPrice;
    String status;
    String baggageAllowance;

    public Airline() {
        System.out.println("No parameter Constructor called.");
    }

    public Airline(String airlineName, int flightNumber) {
        this.airlineName = airlineName;
        this.flightNumber = flightNumber;
    }

    public Airline(String airlineName, int flightNumber, String destination, String departureTime) {
        this(airlineName, flightNumber);
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public Airline(String airlineName, int flightNumber, String destination, String departureTime, String arrivalTime, String aircraftModel) {
        this(airlineName, flightNumber, destination, departureTime);
        this.arrivalTime = arrivalTime;
        this.aircraftModel = aircraftModel;
    }

    public Airline(String airlineName, int flightNumber, String destination, String departureTime, String arrivalTime, String aircraftModel, int capacity, double ticketPrice, String status, String baggageAllowance) {
        this(airlineName, flightNumber, destination, departureTime, arrivalTime, aircraftModel);
        this.capacity = capacity;
        this.ticketPrice = ticketPrice;
        this.status = status;
        this.baggageAllowance = baggageAllowance;
    }

    public void info() {
        System.out.println("Airline Name: " + airlineName +
                ", Flight Number: " + flightNumber +
                ", Destination: " + destination +
                ", Departure Time: " + departureTime +
                ", Arrival Time: " + arrivalTime +
                ", Aircraft Model: " + aircraftModel +
                ", Capacity: " + capacity +
                ", Ticket Price: $" + ticketPrice +
                ", Status: " + status +
                ", Baggage Allowance: " + baggageAllowance);
    }

}
