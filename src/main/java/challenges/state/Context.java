package challenges.state;

public class Context implements State{
    private State state;

    public Context(State state) {
        this.state = state;
    }

    @Override
    public void doThis() {
        state.doThis();
    }

    @Override
    public void doThat() {
        state.doThat();
    }

    public void changeState(State state) {
        this.state = state;
    }
}
