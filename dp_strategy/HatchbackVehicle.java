package dp_strategy;

import dp_strategy.strategy.DriveStrategyNormalImpl;
import dp_strategy.strategy.SeatingStrategyFourImpl;

public class HatchbackVehicle extends Vehicle {
    public HatchbackVehicle() {
        super(new DriveStrategyNormalImpl(), new SeatingStrategyFourImpl());
    }
}
