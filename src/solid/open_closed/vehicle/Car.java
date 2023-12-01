package solid.open_closed.vehicle;

public class Car extends Vehicle {
    private int seats;

    public Car(String color, String year, int engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    public void configCar() {
        System.out.printf("Create a car: %s - %s - %d with %d", color, year, engine, seats);
        this.startVehicle();
    }
}
