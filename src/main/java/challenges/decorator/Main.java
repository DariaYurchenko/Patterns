package challenges.decorator;

import challenges.decorator.components.Pizza;
import challenges.decorator.components.ThickPizza;
import challenges.decorator.decorators.Cheese;
import challenges.decorator.decorators.Olives;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new ThickPizza();
        pizza = new Cheese(pizza);
        pizza = new Olives(pizza);
        System.out.println(pizza.cost());
    }
}
