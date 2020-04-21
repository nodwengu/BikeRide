package main.bicycles.bikeRides;

import main.bicycles.Bicycle;
import main.bicycles.BikeRide;

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
      //System.out.println("ride() METHOD BikeRideTedo-Currrent speed: = " + bicycle.currentSpeed());
   }
   
   public void ride(Bicycle bicycle) {
      bicycle.accelerate();
      bicycle.accelerate();
     
   //   System.out.println("ride(Bicycle bicycle) METHOD BikeRideTedo-Currrent speed: = ....." + bicycle.currentSpeed());
   }
}
