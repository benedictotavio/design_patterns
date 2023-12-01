package patterns.creation.builder.builders;

import patterns.creation.builder.cars.Truck;
import patterns.creation.builder.componets.CarType;
import patterns.creation.builder.componets.Engine;
import patterns.creation.builder.componets.Transmission;


public class TruckBuilder implements IBuilder {
    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Truck getresult(){
        return new Truck(carType, seats, engine, transmission);
    }
}
