package main.java.com.pattern.factory.abstractfactory;

public class NextGenElectricCar implements ElectricVehicle {
    @Override
    public void build() {
        System.out.println("NextGen Electric Car");
    }
}
