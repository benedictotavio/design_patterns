package patterns.creation.builder;

import patterns.creation.builder.builders.CarBuilder;
import patterns.creation.builder.builders.TruckBuilder;
import patterns.creation.builder.cars.Car;
import patterns.creation.builder.cars.Truck;
import patterns.creation.builder.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        //New Car
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        //New Truck
        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Car car = builder.getresult();
        Truck truck = truckBuilder.getresult();

        System.out.println(car.getCarType());
        System.out.println(car.getTransmission());
        System.out.println("--------------------");
        System.out.println(truck.result());
    }
}