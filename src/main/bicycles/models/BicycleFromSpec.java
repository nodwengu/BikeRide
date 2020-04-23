package main.bicycles.models;

import main.bicycles.BicycleBase;
import main.bicycles.BicycleType;
import main.bicycles.specification.BicycleSpecification;

public class BicycleFromSpec extends BicycleBase {
   
   BicycleSpecification bicycleSpecification;

   public BicycleFromSpec(BicycleSpecification bicycleSpecification) {
      this.bicycleSpecification = bicycleSpecification;
   }
   
   public void  accelerate() {
      this.changeSpeed(5);
   }
   
   public void brake() {
      this.changeSpeed(-3);
   }
   
   public BicycleType getBicycleType() {
      return BicycleType.BicycleFromSpec;
   }
   
}
