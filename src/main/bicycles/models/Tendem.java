package main.bicycles.models;

import main.bicycles.BicycleBase;

public class Tendem extends BicycleBase {
    public void  accelerate() {
        this.changeSpeed(12);
    }
    
    public void brake() {
        this.changeSpeed(-7);
    }
}
