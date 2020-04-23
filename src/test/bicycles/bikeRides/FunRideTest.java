package bicycles.bikeRides;

import main.bicycles.BicycleType;
import main.bicycles.bikeRides.FunRide;
import main.bicycles.models.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FunRideTest {
   
   @Test
   void getCountType() {
      FunRide funRide = new FunRide(4);
      funRide.accept(new MountainBike());
      funRide.accept(new RoadBike());

      BicycleType bicycleType = BicycleType.MountainBike;
      Assertions.assertEquals(1, funRide.getCountForType(bicycleType));
      Assertions.assertEquals(2, funRide.getEnteredCount());
   }
   
   @Test
   void accept() {
      FunRide funRide = new FunRide(7);
      funRide.accept(new MountainBike());
      funRide.accept(new RoadBike());
      funRide.accept(new MountainBike());

      BicycleType bicycleType = BicycleType.RoadBike;
      Assertions.assertEquals(1, funRide.getCountForType(bicycleType));
      Assertions.assertEquals(3, funRide.getEnteredCount());
   }
   
   @Test
   void getEnteredCount() {
      FunRide funRide = new FunRide(10);
      funRide.accept(new Tendem());
      funRide.accept(new RoadBike());
      funRide.accept(new Tendem());

      BicycleType bicycleType = BicycleType.Tandem;
      Assertions.assertEquals(2, funRide.getCountForType(bicycleType));
      Assertions.assertEquals(3, funRide.getEnteredCount());
   }
}