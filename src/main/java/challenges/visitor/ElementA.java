package challenges.visitor;

public class ElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
