package withdesignpattern.strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving a sports vehicle with high speed and agility.");
    }
}
