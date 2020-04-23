package main.bicycles.models;

import main.bicycles.BicycleBase;
import main.bicycles.BicycleType;

public class RoadBike extends BicycleBase {
    public void  accelerate() {
        this.changeSpeed(11);
    }
    public void brake() {
        this.changeSpeed(-4);
    }
    public BicycleType getBicycleType() {
        return BicycleType.RoadBike;
    }
}