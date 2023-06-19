package dp_strategy;

public class HatchbackVehicle extends Vehicle {
    public HatchbackVehicle() {
        super(new DriveStrategyNormalImpl(), new SeatingStrategyFourImpl());
    }
}
