package dp_strategy;

import dp_strategy.model.HatchbackVehicle;
import dp_strategy.model.MultiUtilityVehicle;
import dp_strategy.model.SportsUtilityVehicle;

public class App {
    public static void main(String[] args) {
        SportsUtilityVehicle suv = new SportsUtilityVehicle();
        suv.drive();
        suv.capacity();

        MultiUtilityVehicle muv = new MultiUtilityVehicle();
        muv.drive();
        muv.capacity();

        HatchbackVehicle hatch = new HatchbackVehicle();
        hatch.drive();
        hatch.capacity();
    }
}
