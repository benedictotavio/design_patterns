package patterns.creation.abstract_factory.domain.factories;

import patterns.creation.abstract_factory.domain.aircrafts.Helicopter;
import patterns.creation.abstract_factory.domain.aircrafts.IAircraft;
import patterns.creation.abstract_factory.domain.landvehicles.ILandVehicle;
import patterns.creation.abstract_factory.domain.landvehicles.Motorcycle;
import patterns.creation.abstract_factory.domain.marinecraft.IMarineCraft;
import patterns.creation.abstract_factory.domain.marinecraft.Iate;

public class NiniNineTransport implements ITransportFactory {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public IMarineCraft createTransportMarine() {
        return new Iate();
    }
    
}
