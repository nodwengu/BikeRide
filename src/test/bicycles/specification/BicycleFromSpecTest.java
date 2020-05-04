package bicycles.specification;

import main.bicycles.BicycleType;
import main.bicycles.specification.BicycleSpecification;
import main.bicycles.Bicycle;
import main.bicycles.specification.BicycleFromSpec;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleFromSpecTest {
   BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
   BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
   BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
   
   BicycleFromSpec bicycleFromSpec1 = new BicycleFromSpec(mountainBikeSpec);
   BicycleFromSpec bicycleFromSpec2 = new BicycleFromSpec(roadBikeSpec);
   BicycleFromSpec bicycleFromSpec3 = new BicycleFromSpec(tandemBikeSpec);
   
   @Test
   protected void getAccelerationSpeed() {
      Assertions.assertEquals(5, bicycleFromSpec1.getAccelarationSpeed());
      Assertions.assertEquals(11, bicycleFromSpec2.getAccelarationSpeed());
      Assertions.assertEquals(12, bicycleFromSpec3.getAccelarationSpeed());
   }

   @Test
   protected void getBrakeSpeed() {
      Assertions.assertEquals(3, bicycleFromSpec1.getBrakeSpeed());
      Assertions.assertEquals(4, bicycleFromSpec2.getBrakeSpeed());
      Assertions.assertEquals(7, bicycleFromSpec3.getBrakeSpeed());
   }
}