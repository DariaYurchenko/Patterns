package challenges.mediator;

public class ComponentA implements Component {
    private Mediator mediator;

    public ComponentA(Mediator mediator) {
        this.mediator = mediator;
    }

    public void a() {
        System.out.println("A");
        mediator.notify(this);
    }
}
