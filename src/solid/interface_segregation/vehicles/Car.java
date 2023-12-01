package solid.interface_segregation.vehicles;

public class Car implements IVehicles,IVehicleCar{
    private String color;
    private String year;
    private double engine;
    private int seats = 4;


    public Car(String color, String year, int engine, int seats) {
        configureCar(color,year,engine,seats);
    }

    @Override
    public void configureCar(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        System.out.println();
        System.out.printf("Create a car: %s - %s - %f with %d", color, year, engine, seats);
        startVehicles();
    }


    @Override
    public void startVehicles() {
        System.out.println("bruuuuuuuuummmmmmm");
    }

    @Override
    public String toString() {
        return "Car [color=" + color + ", year=" + year + ", engine=" + engine + ", seats=" + seats + "]";
    }

    
}
