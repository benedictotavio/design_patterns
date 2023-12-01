package patterns.creation.abstract_factory.domain.marinecraft;

public class Boat implements IMarineCraft {
    @Override
    public void startRoute() {
        getCargo();
        velocity();
        System.out.println("Start new boat.");
    }

    @Override
    public void getCargo() {
        System.out.println("All passengers is ready. Boat is on!!!");
    }

    @Override
    public void velocity() {
        System.out.println("Wind on 45 miles per minute.");
        ;
    }

}
