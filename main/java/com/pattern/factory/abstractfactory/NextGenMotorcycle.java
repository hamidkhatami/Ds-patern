package main.java.com.pattern.factory.abstractfactory;

import main.java.com.pattern.factory.factorymethod.MotorVehicle;

public class NextGenMotorcycle implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("Next Gen Motorcycle");
    }
}
