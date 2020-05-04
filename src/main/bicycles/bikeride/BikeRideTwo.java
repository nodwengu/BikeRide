package main.bicycles.bikeride;

import main.bicycles.Bicycle;

public class BikeRideTwo implements BikeRide {
   Bicycle bicycle;
   
   public BikeRideTwo() {
      super();
   }
   
   public BikeRideTwo(Bicycle bicycle) {
      super();
      this.bicycle = bicycle;
   }
   
   public void ride() {
      bicycle.accelerate();
      bicycle.accelerate();
   }
   
}
;