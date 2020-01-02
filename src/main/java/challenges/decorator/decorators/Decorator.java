package challenges.decorator.decorators;

import challenges.decorator.components.Pizza;

public abstract class Decorator extends Pizza {
    Pizza pizza;

    public Decorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
