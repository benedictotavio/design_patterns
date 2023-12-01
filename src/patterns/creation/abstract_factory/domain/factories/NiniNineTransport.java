package patterns.creation.abstract_factory.domain.factories;

import patterns.creation.abstract_factory.domain.aircrafts.Helicopter;
import patterns.creation.abstract_factory.domain.aircrafts.IAircraft;
import patterns.creation.abstract_factory.domain.landvehicles.ILandVehicle;
import patterns.creation.abstract_factory.domain.landvehicles.Motorcycle;

public class NiniNineTransport implements ITransportFactory {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportaAircraft() {
        return new Helicopter();
    }
    
}
