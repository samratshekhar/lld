package dp_strategy;

public class MultiUtilityVehicle extends Vehicle {
    public MultiUtilityVehicle() {
        super(new DriveStrategyNormalImpl(), new SeatingStrategySevenImpl());
    }
}
