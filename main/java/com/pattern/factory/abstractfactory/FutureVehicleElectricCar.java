package main.java.com.pattern.factory.abstractfactory;

public class FutureVehicleElectricCar implements ElectricVehicle {
    @Override
    public void build() {
        System.out.println("Future Vehicle Electric Car");
    }
}
