package challenges.mediator;

public class ConcreteMediator implements Mediator {
    private ComponentA a;
    private ComponentB b;

    public ConcreteMediator(ComponentA a, ComponentB b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void notify(Component component) {
        if(component.equals(a)) {
            reactOnA();
        }
        if(component.equals(b)) {
            reactOnB();
        }
    }

    //notifies other components that has done smth
    private void reactOnA() {
        System.out.println("AAA");
        b.b();
    }

    private void reactOnB() {
        System.out.println("BBB");
        a.a();
    }
}
