package patterns.creation.factory.domain.vehicles;

public class Car implements IVehicles {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("init run!");
    }

    @Override
    public void getCargo() {
       System.out.println("Get passegers!");
    }
    
}
