package liskov_substitution_example;

import java.util.ArrayList;
import java.util.List;

public class Problem {

    static class Vehicle {
        public Integer getNumberOfWheels() {
            return 2;
        }

        public Boolean turnOnEngine() {
            return true;
        }
    }

    static class Car extends Vehicle {
        @Override
        public Integer getNumberOfWheels() {
            return 4;
        }
    }

    static class Bike extends Vehicle {
    }

    static class Bicycle extends Vehicle {
        @Override
        public Boolean turnOnEngine() {
            return null;
        }
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Bicycle());// This will throw NPE in sysout below.
        // Bicycle extending vehicle is breaking Liskov's substitution principle.

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.turnOnEngine().toString());
        }
    }
}
