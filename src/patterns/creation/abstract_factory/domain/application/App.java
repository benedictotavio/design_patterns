package patterns.creation.abstract_factory.domain.application;

import patterns.creation.abstract_factory.domain.aircrafts.IAircraft;
import patterns.creation.abstract_factory.domain.factories.ITransportFactory;
import patterns.creation.abstract_factory.domain.landvehicles.ILandVehicle;

public class App {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public App(ITransportFactory factory) {
        this.vehicle = factory.createTransportVehicle();
        this.aircraft = factory.createTransportaAircraft();
    }

    public void startRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
    }

}
