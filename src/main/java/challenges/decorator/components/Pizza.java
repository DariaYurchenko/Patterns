package challenges.decorator.components;

public abstract class Pizza {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}
