package dp_strategy;

import dp_strategy.strategy.DriveStrategyNormalImpl;
import dp_strategy.strategy.SeatingStrategySevenImpl;

public class MultiUtilityVehicle extends Vehicle {
    public MultiUtilityVehicle() {
        super(new DriveStrategyNormalImpl(), new SeatingStrategySevenImpl());
    }
}
