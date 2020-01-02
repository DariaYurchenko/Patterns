package challenges.adapter;

import challenges.adapter.adapter.DroneAdapter;
import challenges.adapter.adapter.SuperDrone;

public class Main {

    public static void main(String[] args) {
        Duck duck = new DroneAdapter(new SuperDrone());
        test(duck);
    }

    private static void test(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
