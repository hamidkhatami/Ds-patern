package main.java.com.pattern.adaptor.objectAdaptor;

import main.java.com.pattern.adaptor.Socket;
import main.java.com.pattern.adaptor.SocketAdapter;
import main.java.com.pattern.adaptor.Volt;

public class SocketObjectAdaptorImpl implements SocketAdapter {
    //Using Composition for adapter pattern
    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    private Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(socket.getVolt(), 10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(socket.getVolt(), 40);
    }
}
