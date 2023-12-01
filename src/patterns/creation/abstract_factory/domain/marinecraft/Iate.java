package patterns.creation.abstract_factory.domain.marinecraft;

public class Iate implements IMarineCraft {
    @Override
    public void startRoute() {
        getCargo();
        velocity();
        System.out.println("Start new iate trip.");
    }

    @Override
    public void getCargo() {
        System.out.println("All passengers is ready. Iate is on!!!");
    }

    @Override
    public void velocity() {
        System.out.println("Wind on 25 miles.");
        ;
    }

}
