package main.bicycles.bikeride;

import main.bicycles.Bicycle;

public class BikeRideOne implements BikeRide {
   Bicycle bicycle;
   
   public BikeRideOne() {
      super();
   }
   
   public BikeRideOne(Bicycle bicycle) {
      super();
      this.bicycle = bicycle;
   }
   
   public void ride() {
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.brake();
   }
}