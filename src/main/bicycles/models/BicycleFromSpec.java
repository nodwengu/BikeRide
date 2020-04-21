package main.bicycles.models;

import main.bicycles.BicycleBase;
import main.bicycles.specification.BicycleSpecification;

public class BicycleFromSpec extends BicycleBase {
   
   BicycleSpecification bicycleSpecification;

   public BicycleFromSpec(BicycleSpecification bicycleSpecification) {
      this.bicycleSpecification = bicycleSpecification;
//      System.out.println();
        //System.out.println("BicycleFromSpec Acceleration speed: " + this.bicycleSpecification.getAccelerationSpeed());
//      System.out.println("BicycleFromSpec Brake speed: " + this.bicycleSpecification.getBrakeSpeed());
//      System.out.println("BicycleFromSpec getBicycleType: " + this.bicycleSpecification.getBicycleType());
   }
   
   public void  accelerate() {
      this.changeSpeed(5);
   }
   
   public void brake() {
      this.changeSpeed(-3);
   }
   
}
