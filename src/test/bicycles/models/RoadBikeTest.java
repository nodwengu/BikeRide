package bicycles.models;

import main.bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeTest {
   RoadBike roadBike = new RoadBike();
   
   @Test
   protected void accelerate() {
      assertEquals(0, roadBike.currentSpeed());
      roadBike.accelerate();
      assertEquals( 11, roadBike.currentSpeed() );
      roadBike.stop();
      assertEquals(0, roadBike.currentSpeed());
   }
   
   @Test
   protected void brake() {
      assertEquals(0, roadBike.currentSpeed());
      roadBike.accelerate();
      roadBike.accelerate();
      assertEquals( 22, roadBike.currentSpeed() );
      roadBike.brake();
      assertEquals(18, roadBike.currentSpeed());
   }
}
