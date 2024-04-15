package main.java.com.pattern.state;

/**
 * @author Mostafa Kalantar (kalantar@caspco.ir)
 * @version 1.0 2024.0227
 * @since 1.0
 */
public class TvStopState implements State{
    @Override
    public void doAction() {
        System.out.println("TV is turned Off");

    }
}
