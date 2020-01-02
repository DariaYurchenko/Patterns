package challenges.decorator.decorators;

import challenges.decorator.components.Pizza;

public class Cheese extends Decorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return pizza.cost() + 2;
    }
}
