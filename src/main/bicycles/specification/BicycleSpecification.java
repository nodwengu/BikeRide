package main.bicycles.specification;

import main.bicycles.BicycleType;

public class BicycleSpecification {
   BicycleType bicycleType;
   private int accelerationSpeed;
   private int brakeSpeed;
   
   public BicycleSpecification(int accelerationSpeed, int brakeSpeed) {
      this.accelerationSpeed = accelerationSpeed;
      this.brakeSpeed = brakeSpeed;
   }
   
   public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType type) {
      this.accelerationSpeed = accelerationSpeed;
      this.brakeSpeed = brakeSpeed;
      this.bicycleType = type;
   }
   
   public  BicycleType getBicycleType() {
      return bicycleType;
   }
   
   public int getAccelerationSpeed(){
      return accelerationSpeed;
   }
   
   public int getBrakeSpeed() {
      return brakeSpeed;
   }
}
