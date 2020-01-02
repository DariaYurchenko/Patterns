package challenges.chainofresponsibility;

public abstract class BaseHandler implements Handler {
    Handler next;

    @Override
    public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public void handle(Object request) {
        if(next != null) {
            next.handle(request);
        }
    }
}
