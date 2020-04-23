package main.bicycles;

public abstract class  BicycleBase implements Bicycle {
    private int speed;

    protected void changeSpeed(int theSpeed) {
        this.speed += theSpeed;
    }
    public int currentSpeed() {
        return speed;
    }
    public void stop() {
        this.speed = 0;
    }
    
}
