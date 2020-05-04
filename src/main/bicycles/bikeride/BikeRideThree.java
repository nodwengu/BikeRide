package main.bicycles.bikeride;

import main.bicycles.Bicycle;

public class BikeRideThree implements BikeRide {
   Bicycle bicycle;
   
   public BikeRideThree() {
      super();
   }
   
   public BikeRideThree(Bicycle bicycle) {
      super();
      this.bicycle = bicycle;
   }
   
   public void ride() {
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.accelerate();
   }
   
}
