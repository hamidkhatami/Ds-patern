package main.java.com.pattern.builder;

public class runner {
    public static void main(String[] args) {
        Computer cpmp=new Computer.ComputerBuilder("500 GB","2 GB").isGraphicalCardEnabled(true).isBluetoothEnabled(false).build();

    }
}
