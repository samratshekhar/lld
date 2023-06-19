package dp_strategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    SeatingStrategy seatingStrategy;

    public Vehicle(DriveStrategy driveStrategy, SeatingStrategy seatingStrategy) {
        this.driveStrategy = driveStrategy;
        this.seatingStrategy = seatingStrategy;
    }
}
