package solid.open_closed;

public class Vehicle {

    private String color;
    private String year;
    private int engine;
    private int seats;

    public Vehicle(String color, String year, int engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    void car() {
        System.out.printf("Create a car: %s - %s - %d with %d", color, year, engine, seats);
    }

    void motocycle() {
        System.out.printf("Create a motorcycle: %s - %d cilinders", year, engine);
    }

    void startVehicle() {
        System.out.println("Bruuuuummmmmmmmmmmm");
    }
}
