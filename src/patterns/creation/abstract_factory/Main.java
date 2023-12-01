package patterns.creation.abstract_factory;

import patterns.creation.abstract_factory.domain.application.App;
import patterns.creation.abstract_factory.domain.factories.ITransportFactory;
import patterns.creation.abstract_factory.domain.factories.NiniNineTransport;
import patterns.creation.abstract_factory.domain.factories.UberTransport;

public class Main {

    public static App configApp() {
        App app;
        ITransportFactory factory;

        String company = "uber";
        if (company == "uber") {
            factory = new UberTransport();
        } else {
            factory = new NiniNineTransport();
        }
        app = new App(factory);
        return app;
    }

    public static void main(String[] args) {
        App app = configApp();
        app.startRoute();
    }
}
