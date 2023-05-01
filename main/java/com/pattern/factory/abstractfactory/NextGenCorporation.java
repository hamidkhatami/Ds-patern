package main.java.com.pattern.factory.abstractfactory;

import main.java.com.pattern.factory.factorymethod.MotorVehicle;

public class NextGenCorporation extends Corporation {
    @Override
    public MotorVehicle createMotorVehicle() {
        return new NextGenMotorcycle();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new NextGenElectricCar();
    }
}
