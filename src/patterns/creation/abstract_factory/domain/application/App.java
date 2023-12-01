package patterns.creation.abstract_factory.domain.application;

import patterns.creation.abstract_factory.domain.aircrafts.IAircraft;
import patterns.creation.abstract_factory.domain.factories.ITransportFactory;
import patterns.creation.abstract_factory.domain.landvehicles.ILandVehicle;
import patterns.creation.abstract_factory.domain.marinecraft.IMarineCraft;

public class App {
    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private IMarineCraft marineCraft;

    public App(ITransportFactory factory) {
        this.vehicle = factory.createTransportVehicle();
        this.aircraft = factory.createTransportAircraft();
        this.marineCraft = factory.createTransportMarine();
    }

    public void startRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
        marineCraft.startRoute();
    }

}
