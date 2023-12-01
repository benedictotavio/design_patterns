package solid.interface_segregation.vehicles;

public class Motorcycle implements IVehicles,IVehicleMotorcycle {
    private String color;
    private String year;
    private double engine;
    private int seats;

    public Motorcycle(String color, String year, double engine, int seats){
        configureMotor(color,year,engine,seats);
    }


    @Override
    public void configureMotor(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        System.out.println();
        System.out.printf("Create a motor: %s - %s - %.2f%n with %d", color, year, engine, seats);
        startVehicles();
    }

    @Override
    public void startVehicles() {

    }
}
