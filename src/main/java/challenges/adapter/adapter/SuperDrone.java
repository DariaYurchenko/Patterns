package challenges.adapter.adapter;

public class SuperDrone implements Drone {
    public void beep() {
        System.out.println("Beep");
    }

    public void spin() {
        System.out.println("Spin");
    }

    public void take() {
        System.out.println("Take");
    }
}
