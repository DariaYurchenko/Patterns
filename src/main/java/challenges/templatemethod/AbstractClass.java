package challenges.templatemethod;

public abstract class AbstractClass {

    public void templateMethod() {
        step1();
        step2();
        step3();
    }

    public abstract void step1();

    public abstract void step2();

    public abstract void step3();
}
