package main.java.com.pattern.adaptor;

public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
