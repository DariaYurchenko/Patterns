package challenges.visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ElementA a) {
        System.out.println("A");
    }

    @Override
    public void visit(ElementB b) {
        System.out.println("B");
    }
}
