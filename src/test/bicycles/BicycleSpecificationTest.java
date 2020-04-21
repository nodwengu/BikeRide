package test.bicycles;

import main.bicycles.bikeRides.BikeRideFour;
import org.junit.jupiter.api.Test;

import main.bicycles.specification.BicycleSpecification;
import main.bicycles.BicycleType;

import static org.junit.Assert.assertEquals;

public class BicycleSpecificationTest {
   @Test
   protected void test() {
      BicycleSpecification mountainBikeSpec1 = new BicycleSpecification(11, 4);
      assertEquals( 11, mountainBikeSpec1.getAccelerationSpeed() );
   
      assertEquals( 4, mountainBikeSpec1.getBrakeSpeed() );
      
      BicycleType bicycleType = BicycleType.MountainBike;
      BicycleSpecification mountainBikeSpec2 = new BicycleSpecification(12, 6, bicycleType);
      //System.out.println(mountainBikeSpec2.getBicycleType());
      
      assertEquals( BicycleType.MountainBike, mountainBikeSpec2.getBicycleType() );
   }
   
   @Test
   protected void getBicycleTypeTest() {
      BicycleSpecification mountainBikeSpec1 = new BicycleSpecification(5, 3);
      assertEquals( 5, mountainBikeSpec1.getAccelerationSpeed() );
      
      assertEquals( 3, mountainBikeSpec1.getBrakeSpeed() );
      
      BicycleType bicycleType = BicycleType.BicycleFromSpec;
      BicycleSpecification mountainBikeSpec2 = new BicycleSpecification(12, 6, bicycleType);
      //System.out.println(mountainBikeSpec2.getBicycleType());

      assertEquals( BicycleType.BicycleFromSpec, mountainBikeSpec2.getBicycleType() );
   }
}
