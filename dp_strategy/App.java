package dp_strategy;

public class App {
    public static void main(String[] args) {
        SportsUtilityVehicle suv = new SportsUtilityVehicle();
        suv.driveStrategy.drive();
        suv.seatingStrategy.capacity();

        MultiUtilityVehicle muv = new MultiUtilityVehicle();
        muv.driveStrategy.drive();
        muv.seatingStrategy.capacity();

        HatchbackVehicle hatch = new HatchbackVehicle();
        hatch.driveStrategy.drive();
        hatch.seatingStrategy.capacity();
    }
}
