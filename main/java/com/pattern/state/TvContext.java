package main.java.com.pattern.state;

/**
 * @author Mostafa Kalantar (kalantar@caspco.ir)
 * @version 1.0 2024.0227
 * @since 1.0
 */
public class TvContext implements State {
    private State tvState;

    public State getTvState() {
        return tvState;
    }

    public void setTvState(State tvState) {
        this.tvState = tvState;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }
}
