package patterns.creation.abstract_factory.domain.factories;

import patterns.creation.abstract_factory.domain.aircrafts.IAircraft;
import patterns.creation.abstract_factory.domain.landvehicles.ILandVehicle;
import patterns.creation.abstract_factory.domain.marinecraft.IMarineCraft;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    IMarineCraft createTransportMarine();
}
