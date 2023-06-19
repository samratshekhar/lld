package dp_decorator.decorator;

import dp_decorator.model.BasePizza;

public class CheeseDecorator extends ToppingsDecorator {

    public CheeseDecorator(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }

}
