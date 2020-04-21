package main.bicycles;

public abstract class BikeRideBase implements BikeRide {
   Bicycle bicycle;
      
   public BikeRideBase(Bicycle bicycle) {
      this.bicycle = bicycle;
   }
   
   public BikeRideBase() {
      super();
   }
   
//   public void ride() {
//      System.out.println("Bike Ride current Speed (BikeRideBase)" + bicycle.currentSpeed());
//   }
   
   public void ride(Bicycle bicycle) {
      System.out.println("Bike Ride current Speed (BikeRideBase)" + bicycle.currentSpeed());
   }
      
   public int currentSpeed() {
      return bicycle.currentSpeed();
   }
}
