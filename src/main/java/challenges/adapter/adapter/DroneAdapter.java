package challenges.adapter.adapter;

import challenges.adapter.Duck;

public class DroneAdapter extends Duck {
    Drone drone;

    public DroneAdapter(Drone drone) {
        this.drone = drone;
    }

    public void fly() {
        drone.take();
        drone.spin();
    }

    public void quack() {
        drone.beep();
    }
}
