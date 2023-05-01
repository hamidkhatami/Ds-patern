package main.java.com.pattern.factory.abstractfactory;

import main.java.com.pattern.factory.factorymethod.MotorVehicle;

public abstract class Corporation {
    public abstract MotorVehicle createMotorVehicle();
    public abstract ElectricVehicle createElectricVehicle();
}
