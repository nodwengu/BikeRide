package bicycles.bikeRides;

import main.bicycles.specification.BicycleFromSpec;
import main.bicycles.specification.BicycleSpecification;
import main.bicycles.BicycleType;
import main.bicycles.bikeride.FunRide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FunRideTest {
   BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
   BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
   BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
   
   BicycleFromSpec bicycleFromSpec1 = new BicycleFromSpec(mountainBikeSpec);
   BicycleFromSpec bicycleFromSpec2 = new BicycleFromSpec(roadBikeSpec);
   BicycleFromSpec bicycleFromSpec3 = new BicycleFromSpec(tandemBikeSpec);
   BicycleFromSpec bicycleFromSpec4 = new BicycleFromSpec(mountainBikeSpec);
   
   @Test
   void getCountTypeTest() {
      FunRide funRide = new FunRide(5);
      funRide.accept(bicycleFromSpec1);
      funRide.accept(bicycleFromSpec2);
      funRide.accept(bicycleFromSpec3);
      funRide.accept(bicycleFromSpec4);
      
      
      Assertions.assertEquals(2, funRide.getCountForType(BicycleType.MountainBike));
      Assertions.assertEquals(1, funRide.getCountForType(BicycleType.RoadBike));
      Assertions.assertEquals(1, funRide.getCountForType(BicycleType.Tandem));
   
      Assertions.assertEquals(5, bicycleFromSpec1.getAccelarationSpeed());
      Assertions.assertEquals(11, bicycleFromSpec2.getAccelarationSpeed());
      Assertions.assertEquals(12, bicycleFromSpec3.getAccelarationSpeed());
      Assertions.assertEquals(5, bicycleFromSpec4.getAccelarationSpeed());
   
      Assertions.assertEquals(3, bicycleFromSpec1.getBrakeSpeed());
      Assertions.assertEquals(4, bicycleFromSpec2.getBrakeSpeed());
      Assertions.assertEquals(7, bicycleFromSpec3.getBrakeSpeed());
      Assertions.assertEquals(3, bicycleFromSpec4.getBrakeSpeed());
      
   }
   
   @Test
   void acceptTest() {
      FunRide funRide = new FunRide(7);
      funRide.accept(bicycleFromSpec1);
      funRide.accept(bicycleFromSpec2);
      
      Assertions.assertEquals(2, funRide.getEnteredCount());
   
      funRide.accept(bicycleFromSpec3);
      
      Assertions.assertEquals(3, funRide.getEnteredCount());
   }
   
   @Test
   void duplicatesTest() {
      FunRide funRide = new FunRide(10);
      funRide.accept(bicycleFromSpec1);
      funRide.accept(bicycleFromSpec2);
      Assertions.assertEquals(2, funRide.getEnteredCount());
   
      funRide.accept(bicycleFromSpec2);
   
      Assertions.assertEquals(2, funRide.getEnteredCount());
   
      funRide.accept(bicycleFromSpec3);
      
      Assertions.assertEquals(3, funRide.getEnteredCount());
   }
   
   @Test
   void maxNumberOfBicyclesTest() {
      FunRide funRide = new FunRide(3);
      funRide.accept(bicycleFromSpec1);
      Assertions.assertEquals(1, funRide.getEnteredCount());
      
      funRide.accept(bicycleFromSpec2);
      funRide.accept(bicycleFromSpec3);
      Assertions.assertEquals(3, funRide.getEnteredCount());
      
      funRide.accept(bicycleFromSpec4);
      
      Assertions.assertEquals(3, funRide.getEnteredCount());
   }
   
}