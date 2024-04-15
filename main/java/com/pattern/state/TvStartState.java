package main.java.com.pattern.state;

import javax.swing.*;

/**
 * @author Mostafa Kalantar (kalantar@caspco.ir)
 * @version 1.0 2024.0227
 * @since 1.0
 */
public class TvStartState implements State {
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");

    }
}
