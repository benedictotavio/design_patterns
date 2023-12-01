package patterns.creation.factory.domain.transports;

import patterns.creation.factory.domain.Transport;
import patterns.creation.factory.domain.vehicles.IVehicles;
import patterns.creation.factory.domain.vehicles.Motorcycle;

public class MotocycleTransport extends Transport {

    @Override
    protected IVehicles createTransport() {
        return new Motorcycle();
    }

}
