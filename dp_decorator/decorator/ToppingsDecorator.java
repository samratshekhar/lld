package dp_decorator.decorator;

import dp_decorator.model.BasePizza;

public abstract class ToppingsDecorator extends BasePizza {

    BasePizza pizza;

    public ToppingsDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

}
