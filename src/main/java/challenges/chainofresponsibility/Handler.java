package challenges.chainofresponsibility;

public interface Handler {

    void setNext(Handler handler);

    void handle(Object request);
}
