package patterns.creation.factory;

import patterns.creation.factory.domain.Transport;
import patterns.creation.factory.domain.transports.BikeTransport;
import patterns.creation.factory.domain.transports.CarTransport;
import patterns.creation.factory.domain.transports.MotocycleTransport;

/**
 * Main
 */
public class Main {
    private static Transport transport;

    public static void main(String[] args) {
        configure(args[0]);
        if (transport != null) {
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch (type) {
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotocycleTransport();
                break;
            case "eats":
                transport = new BikeTransport();
                break;
            default:
                System.out.println("Select a type of log");
        }
    }
}