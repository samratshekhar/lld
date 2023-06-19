package dp_decorator.decorator;

import dp_decorator.model.BasePizza;

public class CheeseDecorator extends ToppingsDecorator {

    private BasePizza basePizza;

    public CheeseDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }

}
