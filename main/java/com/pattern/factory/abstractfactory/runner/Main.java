package main.java.com.pattern.factory.abstractfactory.runner;

import main.java.com.pattern.factory.abstractfactory.*;

public class Main {
    public static void main(String[] args) {
        Corporation corporation=new FutureVehicleCorporation();
        corporation.createElectricVehicle().build();
        corporation.createMotorVehicle().build();
    }
}
