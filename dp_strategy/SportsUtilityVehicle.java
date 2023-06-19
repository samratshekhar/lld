package dp_strategy;

public class SportsUtilityVehicle extends Vehicle {
    public SportsUtilityVehicle() {
        super(new DriveStrategyOffRoadImpl(), new SeatingStrategyFourImpl());
    }
}
