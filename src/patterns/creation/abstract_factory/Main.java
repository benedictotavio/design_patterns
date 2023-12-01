package patterns.creation.abstract_factory;

import java.util.Random;

import patterns.creation.abstract_factory.domain.application.App;
import patterns.creation.abstract_factory.domain.factories.BoatOwTransport;
import patterns.creation.abstract_factory.domain.factories.ITransportFactory;
import patterns.creation.abstract_factory.domain.factories.NiniNineTransport;
import patterns.creation.abstract_factory.domain.factories.UberTransport;

public class Main {

    public static App configApp(String company) {
        ITransportFactory factory;
        switch (company) {
            case "uber":
                factory = new UberTransport();
                break;
            case "99":
                factory = new NiniNineTransport();
                break;
            case "boat":
                factory = new BoatOwTransport();
                break;
            default:
                factory = new BoatOwTransport();
        }

        return new App(factory);

    }

    private static int getRandomIndex(int arrayLength) {
        Random random = new Random();
        return random.nextInt(arrayLength);
    }

    public static void main(String[] args) {
        App app = configApp(args[getRandomIndex(args.length)]);
        app.startRoute();
    }
}
