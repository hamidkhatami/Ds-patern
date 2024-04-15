package main.java.com.pattern.state.runner;

import main.java.com.pattern.state.State;
import main.java.com.pattern.state.TvContext;
import main.java.com.pattern.state.TvStartState;
import main.java.com.pattern.state.TvStopState;

/**
 * @author Mostafa Kalantar (kalantar@caspco.ir)
 * @version 1.0 2024.0227
 * @since 1.0
 */
public class main {
    public static void main(String[] args) {
        TvContext context = new TvContext();
        State tvStartState = new TvStartState();
        State tvStopState = new TvStopState();

        context.setTvState(tvStartState);
        context.doAction();


        context.setTvState(tvStopState);
        context.doAction();
    }

}
