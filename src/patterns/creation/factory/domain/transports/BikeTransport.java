package patterns.creation.factory.domain.transports;

import patterns.creation.factory.domain.Transport;
import patterns.creation.factory.domain.vehicles.Bicycle;
import patterns.creation.factory.domain.vehicles.IVehicles;

public class BikeTransport extends Transport {
    @Override
    protected IVehicles createTransport() {
        return new Bicycle();
    }
}
