package dp_decorator;

import dp_decorator.decorator.CheeseDecorator;
import dp_decorator.decorator.VegToppingsDecorator;
import dp_decorator.model.BasePizza;
import dp_decorator.model.MargheritaPizza;

public class App {
    public static void main(String[] args) {
        BasePizza pizza = new MargheritaPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new VegToppingsDecorator(pizza);

        System.out.println("Price for pizza: " + pizza.cost()); // 130 = 80 + 20 + 30
    }
}
