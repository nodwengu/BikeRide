package main.bicycles.bikeRides;

import main.bicycles.Bicycle;
import main.bicycles.BikeRide;

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
      System.out.println("ride() METHOD BikeRideTwo-Currrent speed: = " + bicycle.currentSpeed());
   }
   
   public void ride(Bicycle bicycle) {
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
      
      System.out.println("ride(Bicycle bicycle) METHOD BikeRideTwo-Currrent speed: = " + bicycle.currentSpeed());
   }
}
;