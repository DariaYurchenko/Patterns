package challenges.prototype;

public class ConcretePrototype implements Prototype {
    private int field;

    public ConcretePrototype(ConcretePrototype prototype) {
        this.field = prototype.field;
    }

    public ConcretePrototype() {
    }

    public Prototype clone() {
        return new ConcretePrototype(this);
    }
}
