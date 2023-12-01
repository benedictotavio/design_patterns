package solid.interface_segregation;

import solid.open_closed.vehicle.Car;
import solid.open_closed.vehicle.Motorcycle;

import java.util.Objects;

public class Main {
    private static String type = "Car";
    public static void main(String[] args) {
        if (Objects.equals(type, "Car")){
            Car car = new Car(null, null, 0, 0);
        }else {
            Motorcycle moto = new Motorcycle(null, null, 0);
        }
    }
}
