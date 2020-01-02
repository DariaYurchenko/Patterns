package challenges.mediator;

public class ComponentB implements Component {
    private Mediator mediator;

    public ComponentB(Mediator mediator) {
        this.mediator = mediator;
    }

    public void b() {
        System.out.println("B");
        mediator.notify(this);
    }
}
