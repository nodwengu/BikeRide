package main.bicycles.specification;

import main.bicycles.BicycleType;

public class BicycleSpecification {
   
   BicycleType bicycleType;
   
   private int accelerationSpeed;
   // add a variable for brakeSpeed
   private int brakeSpeed;
   
   public BicycleSpecification(int accelerationSpeed, int brakeSpeed) {
      this.accelerationSpeed = accelerationSpeed;
      // initialize brakeSpeed private variable
      this.brakeSpeed = brakeSpeed;
      System.out.println("Bicycle constructor");
   }
   
   public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType type) {
      this.accelerationSpeed = accelerationSpeed;
      // initialize brakeSpeed private variable
      this.brakeSpeed = brakeSpeed;
      // existing code above this
      this.bicycleType = type;
   }
   
   public  BicycleType getBicycleType() {
      return bicycleType;
   }
   
   public int getAccelerationSpeed(){
      return accelerationSpeed;
   }
   
   // add getters for brakeSpeed
   public int getBrakeSpeed() {
      return brakeSpeed;
   }
}
