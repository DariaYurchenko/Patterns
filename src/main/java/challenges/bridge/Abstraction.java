package challenges.bridge;

public abstract class Abstraction {
    private Implementation implementation;

    public Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }

    void feature1() {
        implementation.method1();
    }

    void feature2() {
        implementation.method2();
    }


}
