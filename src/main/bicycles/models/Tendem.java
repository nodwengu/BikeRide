package main.bicycles.models;

import main.bicycles.BicycleBase;
import main.bicycles.BicycleType;

public class Tendem extends BicycleBase {
    public void  accelerate() {
        this.changeSpeed(12);
    }
    
    public void brake() {
        this.changeSpeed(-7);
    }
    
    public BicycleType getBicycleType() {
        return BicycleType.Tandem;
    }
}
