package patterns.creation.abstract_factory.domain.landvehicles;

public class Motorcycle implements ILandVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Start new log!");
    }

    @Override
    public void getCargo() {
        System.out.println("We get you package.");
    }
}
