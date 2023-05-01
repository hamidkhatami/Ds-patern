package main.java.com.pattern.factory.abstractfactory;

import main.java.com.pattern.factory.factorymethod.MotorVehicle;

public class FutureVehicleMotorcycle implements MotorVehicle {

    @Override
    public void build() {
        System.out.println("Future Vehicle Motorcycle");
    }
}
