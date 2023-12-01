package solid.open_closed.vehicle;

public class Motorcycle extends Vehicle {


    public Motorcycle(String color, String year, int engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;
    }
    
    public void configMotorcycle() {
        System.out.printf("Create a motorcycle: %s - %d cilinders", year, engine);
        this.startVehicle();
    }

}
