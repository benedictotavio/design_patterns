package patterns.creation.abstract_factory.domain.aircrafts;

public class Helicopter implements IAircraft {

    @Override
    public void startRoute() {
        getCargo();
        wind();
        System.out.println("Start a new fly in Helicopter.");
    }

    @Override
    public void getCargo() {
        System.out.println("All passengers is ready. Fly is on!!!");
    }

    @Override
    public void wind() {
        System.out.println("Wind on 25 miles.");
    }

}
