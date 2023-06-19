package dp_strategy;

import dp_strategy.strategy.DriveStrategy;
import dp_strategy.strategy.SeatingStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy;
    private SeatingStrategy seatingStrategy;

    public Vehicle(DriveStrategy driveStrategy, SeatingStrategy seatingStrategy) {
        this.driveStrategy = driveStrategy;
        this.seatingStrategy = seatingStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }

    public void capacity() {
        seatingStrategy.capacity();
    }
}
