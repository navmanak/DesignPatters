package withoutdesignpattern;

public class SportsVehicle extends Vehicle {
    @Override
    public void drive() {
        //same as OffRoadVehicle
        System.out.println("Sports Driving Capability");
    }
}
