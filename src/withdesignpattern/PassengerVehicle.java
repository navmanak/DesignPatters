package withdesignpattern;

import withdesignpattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{

    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
