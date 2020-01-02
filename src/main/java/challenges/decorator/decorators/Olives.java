package challenges.decorator.decorators;

import challenges.decorator.components.Pizza;

public class Olives extends Decorator {

    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return pizza.cost() + 1;
    }
}
