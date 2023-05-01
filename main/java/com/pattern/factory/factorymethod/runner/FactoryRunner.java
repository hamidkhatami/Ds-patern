package main.java.com.pattern.factory.factorymethod.runner;

import main.java.com.pattern.factory.factorymethod.CarFactory;
import main.java.com.pattern.factory.factorymethod.MotorVehicleFactory;

public class FactoryRunner {

    public static void main(String[] args) {
        MotorVehicleFactory motoFactory=new CarFactory();
        motoFactory.create().build();

    }
}
