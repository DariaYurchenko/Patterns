package challenges.chainofresponsibility;

public class ConcreteHandler2 extends BaseHandler {

    @Override
    public void handle(Object request) {
        System.out.println(2);
        if(next != null) {
            next.handle(request);
        }
    }
}
