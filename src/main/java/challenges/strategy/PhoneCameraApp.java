package challenges.strategy;

import challenges.strategy.strategies.ShareStrategy;

public abstract class PhoneCameraApp {
    ShareStrategy shareStrategy;

    public void take() {
        System.out.println("Take");
    }

    public abstract void edit();

    public void save() {
        System.out.println("Save");
    }

    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }
}
