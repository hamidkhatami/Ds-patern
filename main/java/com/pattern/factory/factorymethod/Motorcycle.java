package main.java.com.pattern.factory.factorymethod;

public class Motorcycle implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("Build Motorcycle");
    }
}
