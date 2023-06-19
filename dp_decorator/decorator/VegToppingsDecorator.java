package dp_decorator.decorator;

import dp_decorator.model.BasePizza;

public class VegToppingsDecorator extends ToppingsDecorator {

    private BasePizza basePizza;

    public VegToppingsDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 30;
    }

}
