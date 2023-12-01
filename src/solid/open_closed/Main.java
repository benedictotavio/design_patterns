package solid.open_closed;

import solid.open_closed.vehicle.Car;
import solid.open_closed.vehicle.Motorcycle;

public class Main {
    public static void main(String[] args) {
        TypeVehicle typeVehicle = TypeVehicle.CAR;

        if (typeVehicle == TypeVehicle.CAR) {
            Car car = new Car(null, null, 0, 0);
            car.configCar();
        } else {
            Motorcycle moto = new Motorcycle(null, null, 0);
            moto.configMotorcycle();
        }

    }
}
