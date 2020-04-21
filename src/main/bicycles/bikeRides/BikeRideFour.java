package main.bicycles.bikeRides;

import main.bicycles.Bicycle;
import main.bicycles.*;

public class BikeRideFour implements BikeRide {
   Bicycle bicycle;
   
   public BikeRideFour() {
      super();
   }
   
   public BikeRideFour(Bicycle bicycle) {
      super();
      this.bicycle = bicycle;
   }
   
   public void ride() {
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.accelerate();
      System.out.println("ride() METHOD BikeRideFour-Currrent speed: = " + bicycle.currentSpeed());
   }
   
   public void ride(Bicycle bicycle) {
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.accelerate();
      bicycle.accelerate();
   
      System.out.println("ride(Bicycle bicycle) METHOD BikeRideFour-Currrent speed: = " + bicycle.currentSpeed());
   }
}
