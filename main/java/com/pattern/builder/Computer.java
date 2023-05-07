package main.java.com.pattern.builder;

public class Computer {
    //required parameter
    private String HDD;
    private String RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;

    }

    public static class ComputerBuilder {

        private String HDD;
        private String RAM;

        //optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }
        public ComputerBuilder isGraphicalCardEnabled(boolean isGraphicsCardEnabled){
            this.isBluetoothEnabled=isGraphicsCardEnabled;
            return this;
        }
        public ComputerBuilder isBluetoothEnabled(boolean isGraphicsCardEnabled){
            this.isBluetoothEnabled=isGraphicsCardEnabled;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }


    }
}
