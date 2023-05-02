package main.java.com.pattern.factory.factorymethod.runner;

import main.java.com.pattern.factory.factorymethod.CarFactory;
import main.java.com.pattern.factory.factorymethod.MotorVehicleFactory;
import main.java.com.pattern.factory.factorymethod.MotorcycleFactory;

public class FactoryRunner {

    public static void main(String[] args) {
        MotorVehicleFactory motoFactory = null;
        CarType Ca = CarType.MOTORCYCLE;
        if (Ca.equals(CarType.CAR))
            motoFactory = new CarFactory();

        if (Ca.equals(CarType.MOTORCYCLE))
            motoFactory = new MotorcycleFactory();

        motoFactory.create().build();

    }
}
