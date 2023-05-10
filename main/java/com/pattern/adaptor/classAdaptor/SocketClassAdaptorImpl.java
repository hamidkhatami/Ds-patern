package main.java.com.pattern.adaptor.classAdaptor;

import main.java.com.pattern.adaptor.Socket;
import main.java.com.pattern.adaptor.SocketAdapter;
import main.java.com.pattern.adaptor.Volt;

//Using inheritance for adapter pattern
public class SocketClassAdaptorImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(getVolt(),10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(getVolt(),40);
    }
    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
