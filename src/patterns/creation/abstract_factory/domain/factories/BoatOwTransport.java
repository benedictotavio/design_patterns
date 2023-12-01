package patterns.creation.abstract_factory.domain.factories;

import patterns.creation.abstract_factory.domain.aircrafts.Airplane;
import patterns.creation.abstract_factory.domain.aircrafts.IAircraft;
import patterns.creation.abstract_factory.domain.landvehicles.Car;
import patterns.creation.abstract_factory.domain.landvehicles.ILandVehicle;
import patterns.creation.abstract_factory.domain.marinecraft.Boat;
import patterns.creation.abstract_factory.domain.marinecraft.IMarineCraft;

public class BoatOwTransport implements ITransportFactory {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public IMarineCraft createTransportMarine() {
        return new Boat();
    }

}
