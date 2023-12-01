package patterns.creation.abstract_factory.domain.landvehicles;

public class Car implements ILandVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Init run!");
    }

    @Override
    public void getCargo() {
        System.out.println("Catch the passengers, are you ready?");
    }
}
