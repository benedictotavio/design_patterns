package patterns.creation.factory.domain.transports;

import patterns.creation.factory.domain.Transport;
import patterns.creation.factory.domain.vehicles.Car;
import patterns.creation.factory.domain.vehicles.IVehicles;

public class CarTransport extends Transport {

    @Override
    protected IVehicles createTransport() {
        return new Car();
    }
    
}
