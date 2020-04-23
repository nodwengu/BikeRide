package bicycles.models;

import main.bicycles.Bicycle;
import main.bicycles.BicycleType;
import main.bicycles.bikeRides.BikeRideOne;
import main.bicycles.bikeRides.BikeRideTwo;
import main.bicycles.models.BicycleFromSpec;
import main.bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleFromSpecTest {
   
   @Test
   protected void getAccelerationSpeed() {
      // MountainBike
      BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3);
      Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
   
      System.out.println(mountainBike instanceof Bicycle);
      // use one of your classes that implements BikeRide
      BikeRideOne mBikeRide = new BikeRideOne(mountainBike);
      //mBikeRide.ride();
      mBikeRide.ride(mountainBike);
      
      assertEquals(5, mountainBikeSpec.getAccelerationSpeed());
   
      assertEquals(3, mountainBikeSpec.getBrakeSpeed());
   
      assertEquals(null, mountainBikeSpec.getBicycleType());
   
   }
   
   @Test
   protected void testing() {
      // RoadBike
      BicycleType bicycleType = BicycleType.RoadBike;
      BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, bicycleType);
      Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

      // use one of your classes that implements BikeRide
      BikeRideTwo rBikeRide = new BikeRideTwo(roadBike);
      //rBikeRide.ride();
      rBikeRide.ride(roadBike);
      
      assertEquals(11, roadBikeSpec.getAccelerationSpeed());

      assertEquals(4, roadBikeSpec.getBrakeSpeed());

      assertEquals(BicycleType.RoadBike, roadBikeSpec.getBicycleType());

   }
}
