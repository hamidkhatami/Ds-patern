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

    //telescoping constructors problem.
//    public Computer(String hdd,String ram){
//        this.HDD=hdd;
//        this.RAM=ram;
//    }
//    public Computer(String hdd,String ram,boolean isGraphicCardEnabled){
//        this.HDD=hdd;
//        this.RAM=ram;
//        this.isGraphicsCardEnabled=isGraphicCardEnabled;
//    }
//    public Computer(String hdd,String ram,boolean isBluetoothEnabled,boolean isGraphicsCardEnabled){
//        this.HDD=hdd;
//        this.RAM=ram;
//        this.isBluetoothEnabled=isBluetoothEnabled;
//        this.isGraphicsCardEnabled=isGraphicsCardEnabled;
//    }


    public static class ComputerBuilder {

        private final String HDD;
        private final String RAM;

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
            Computer computer= new Computer(this);
            validateComputer(computer);
            return computer;
        }
        private void validateComputer(Computer computer) {
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }


    }
}
