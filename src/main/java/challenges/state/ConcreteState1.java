package challenges.state;

public class ConcreteState1 implements State {
    private Context context;

    @Override
    public void doThis() {
        System.out.println(1);
    }

    @Override
    public void doThat() {
        System.out.println(1);
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
