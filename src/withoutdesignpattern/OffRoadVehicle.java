package withoutdesignpattern;

public class OffRoadVehicle extends Vehicle {
    @Override
    public void drive() {
        //same as SportsVehicle
        System.out.println("Sports Driving Capability");
    }
}
