package main.bicycles.bikeRides;

import main.bicycles.Bicycle;
import main.bicycles.*;

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
      System.out.println("ride() METHOD BikeRideThree-Currrent speed: = " + bicycle.currentSpeed());
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
      
      System.out.println("ride(Bicycle bicycle) METHOD BikeRideThree-Currrent speed: = " + bicycle.currentSpeed());
   }
}
