package dp_strategy.model;

import dp_strategy.strategy.DriveStrategyOffRoadImpl;
import dp_strategy.strategy.SeatingStrategyFourImpl;

public class SportsUtilityVehicle extends Vehicle {
    public SportsUtilityVehicle() {
        super(new DriveStrategyOffRoadImpl(), new SeatingStrategyFourImpl());
    }
}
