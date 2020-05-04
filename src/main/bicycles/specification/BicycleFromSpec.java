package main.bicycles.specification;

import main.bicycles.BicycleType;

public class BicycleFromSpec {
   
   BicycleSpecification bicycleSpecification;

   public BicycleFromSpec(BicycleSpecification bicycleSpecification) {
      this.bicycleSpecification = bicycleSpecification;
   }
   
   public BicycleType getBicycleType() {
      return bicycleSpecification.getBicycleType();
   }
   
   public int getAccelarationSpeed() {
      return bicycleSpecification.getAccelerationSpeed();
   }
   
   public int getBrakeSpeed() {
      return bicycleSpecification.getBrakeSpeed();
   }
   
}
