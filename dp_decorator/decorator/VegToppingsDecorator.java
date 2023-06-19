package dp_decorator.decorator;

import dp_decorator.model.BasePizza;

public class VegToppingsDecorator extends ToppingsDecorator {

    public VegToppingsDecorator(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 30;
    }

}
