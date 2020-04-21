package test.bicycles;

import main.bicycles.Bicycle;
import main.bicycles.BicycleType;
import main.bicycles.BikeRide;
import main.bicycles.bikeRides.BikeRideFour;
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

      // use one of your classes that implements BikeRide
      BikeRide mBikeRide = new BikeRideFour(mountainBike);
      //mBikeRide.ride();
     // mBikeRide.ride(mountainBike);
      
      //System.out.println("BicycleFromSpec Acceleration speed: " + mountainBikeSpec.getAccelerationSpeed());
      //System.out.println("BicycleFromSpec Brake speed: " + mountainBikeSpec.getBrakeSpeed());
      //System.out.println("BicycleFromSpec getBicycleType: " + mountainBikeSpec.getBicycleType());
      
      assertEquals( 5, mountainBikeSpec.getAccelerationSpeed() );
   
      assertEquals( 3, mountainBikeSpec.getBrakeSpeed() );
   
      assertEquals( null, mountainBikeSpec.getBicycleType() );
   
   }
   
   @Test
   protected void testing() {
      // RoadBike
      BicycleType bicycleType = BicycleType.RoadBike;
      BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, bicycleType);
      Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

      // use one of your classes that implements BikeRide
      BikeRide rBikeRide = new BikeRideFour(roadBike);
     // rBikeRide.ride();
      rBikeRide.ride(roadBike);
      
      //System.out.println("BicycleFromSpec Acceleration speed: " + roadBikeSpec.getAccelerationSpeed());
      //System.out.println("BicycleFromSpec Brake speed: " + roadBikeSpec.getBrakeSpeed());
      //System.out.println("BicycleFromSpec getBicycleType: " + roadBikeSpec.getBicycleType());
      
      assertEquals( 11, roadBikeSpec.getAccelerationSpeed() );
      
      assertEquals( 4, roadBikeSpec.getBrakeSpeed() );
      
      assertEquals( BicycleType.RoadBike, roadBikeSpec.getBicycleType() );
      
   }
   
//   @Test
//   protected void getBrakeSpeed() {
////      System.out.println("BicycleFromSpec Acceleration speed: " + bicycleSpecification.getAccelerationSpeed());
//      System.out.println("BicycleFromSpec Brake speed: " + this.bicycleSpecification.getBrakeSpeed());
//////      System.out.println("BicycleFromSpec getBicycleType: " + this.bicycleSpecification.getBicycleType());
//      assertEquals( 4, bicycleSpecification.getBrakeSpeed() );
//   }
//
//   @Test
//   public void getBicycleType() {
////      System.out.println("BicycleFromSpec Acceleration speed: " + bicycleSpecification.getAccelerationSpeed());
//////      System.out.println("BicycleFromSpec Brake speed: " + this.bicycleSpecification.getBrakeSpeed());
//      System.out.println("BicycleFromSpec getBicycleType: " + this.bicycleSpecification.getBicycleType());
//      assertEquals( null, bicycleSpecification.getBicycleType() );
//   }
}
