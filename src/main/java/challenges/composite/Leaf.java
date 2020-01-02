package challenges.composite;

public class Leaf implements Component {

    @Override
    public void execute() {
        System.out.println("I am Leaf.");
    }
}
