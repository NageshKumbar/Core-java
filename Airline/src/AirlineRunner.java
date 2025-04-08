public class AirlineRunner {
    public static void main(String[] args) {
        Airline airline1 = new Airline();

        String airlineName = "Emirates";
        int flightNumber = 102;
        Airline airline2 = new Airline(airlineName, flightNumber);
        airline2.info();

        airlineName = "Qatar Airways";
        flightNumber = 305;
        String destination = "London";
        String departureTime = "14:45";
        Airline airline3 = new Airline(airlineName, flightNumber, destination, departureTime);
        airline3.info();

        airlineName = "Lufthansa";
        flightNumber = 709;
        destination = "New York";
        departureTime = "18:30";
        String arrivalTime = "22:15";
        String aircraftModel = "Boeing 747";
        Airline airline4 = new Airline(airlineName, flightNumber, destination, departureTime, arrivalTime, aircraftModel);
        airline4.info();

        airlineName = "Singapore Airlines";
        flightNumber = 412;
        destination = "Tokyo";
        departureTime = "09:50";
        arrivalTime = "18:05";
        aircraftModel = "Airbus A380";
        int capacity = 850;
        double ticketPrice = 1200.50;
        String status = "On Time";
        String baggageAllowance = "30kg";
        Airline airline5 = new Airline(airlineName, flightNumber, destination, departureTime, arrivalTime, aircraftModel, capacity, ticketPrice, status, baggageAllowance);
        airline5.info();
    }
}
