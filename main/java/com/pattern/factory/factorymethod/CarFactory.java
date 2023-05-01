package main.java.com.pattern.factory.factorymethod;

public class CarFactory extends MotorVehicleFactory {
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Car();
    }
}
