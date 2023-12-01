package solid.interface_segregation;

import solid.open_closed.vehicle.Car;
import solid.open_closed.vehicle.Motorcycle;

import java.util.Objects;

public class Main {
    private static String type = "Car";

    public static void main(String[] args) {
        if (Objects.equals(type, "Car")) {
            Car car = new Car("grey", "2009", 2, 4);
            System.out.println(car);
        } else {
            Motorcycle moto = new Motorcycle("white", "2014", 4);
            System.out.println(moto.toString());
        }
    }
}
