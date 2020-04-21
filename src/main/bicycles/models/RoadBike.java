package main.bicycles.models;

import main.bicycles.BicycleBase;

public class RoadBike extends BicycleBase {
    public void  accelerate() {
        this.changeSpeed(11);
    }
    public void brake() {
        this.changeSpeed(-4);
    }
}