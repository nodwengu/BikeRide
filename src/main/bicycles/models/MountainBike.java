package main.bicycles.models;
import main.bicycles.BicycleBase;

public class MountainBike extends BicycleBase {
    public void  accelerate() {
        this.changeSpeed(5);
    }
    public void brake() {
        this.changeSpeed(-3);
    }
}
