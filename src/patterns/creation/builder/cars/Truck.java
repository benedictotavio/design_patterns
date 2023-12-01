package patterns.creation.builder.cars;

import patterns.creation.builder.componets.CarType;
import patterns.creation.builder.componets.Engine;
import patterns.creation.builder.componets.Transmission;

public class Truck {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;

    public Truck(CarType carType,
               int seats,
               Engine engine,
               Transmission transmission){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String result(){
        String truck = "Truck with motor: " + engine.getPower() + "\n";
        truck += " Transmission: " + transmission;

        return truck;
    }
}
