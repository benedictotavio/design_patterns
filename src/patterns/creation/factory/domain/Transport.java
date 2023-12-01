package patterns.creation.factory.domain;

import patterns.creation.factory.domain.vehicles.IVehicles;



abstract public class Transport {
    public void startTransport() {
        IVehicles vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicles createTransport();
}
