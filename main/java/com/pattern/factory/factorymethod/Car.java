package main.java.com.pattern.factory.factorymethod;

public class Car implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("Build Car");
    }
}
