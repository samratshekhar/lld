package liskov_substitution_example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static class Vehicle {
        public Integer getNumberOfWheels() {
            return 2;
        }
    }

    static class MotorVehicle extends Vehicle {
        public Boolean turnOnEngine() {
            return true;
        }
    }

    static class Car extends MotorVehicle {
        @Override
        public Integer getNumberOfWheels() {
            return 4;
        }
    }

    static class Bike extends MotorVehicle {
    }

    static class Bicycle extends Vehicle {
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Bicycle());

        for (Vehicle vehicle : vehicles) {
            // System.out.println(vehicle.turnOnEngine()); //TODO: uncomment for clarity
            // Now there is compile safety in the usage of this method
            // If bike is interchanged with car, no vehicle level functionality will break.
        }
    }
}
