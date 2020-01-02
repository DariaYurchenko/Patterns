package challenges.prototype;

public class SubPrototype extends ConcretePrototype {
    private int field2;

    public SubPrototype(SubPrototype prototype) {
        super(prototype);
        this.field2 = prototype.field2;
    }

    public SubPrototype() {
    }

    @Override
    public Prototype clone() {
        return new SubPrototype(this);
    }
}
