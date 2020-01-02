package challenges.state;

public class ConcreteState2 implements State {
    private Context context;

    @Override
    public void doThis() {
        System.out.println(2);
    }

    @Override
    public void doThat() {
        System.out.println(2);
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
