package main.java.com.pattern.factory.abstractfactory;

import main.java.com.pattern.factory.factorymethod.MotorVehicle;

public class FutureVehicleCorporation extends Corporation {
    @Override
    public MotorVehicle createMotorVehicle() {
        return new FutureVehicleMotorcycle();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new FutureVehicleElectricCar();
    }
}
