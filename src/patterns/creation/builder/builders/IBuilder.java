package patterns.creation.builder.builders;


import patterns.creation.builder.componets.CarType;
import patterns.creation.builder.componets.Engine;
import patterns.creation.builder.componets.Transmission;

public interface IBuilder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}
