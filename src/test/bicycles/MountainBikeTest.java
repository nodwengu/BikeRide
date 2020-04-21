package test.bicycles;

//import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import main.bicycles.models.MountainBike;

public class MountainBikeTest {
   MountainBike mountainBike = new MountainBike();
   
   @Test
   protected void accelerate() {
      assertEquals(0, mountainBike.currentSpeed());
      mountainBike.accelerate();
      assertEquals( 5, mountainBike.currentSpeed() );
   }
   
   @Test
   protected void brake() {
      assertEquals(0, mountainBike.currentSpeed());
      mountainBike.accelerate();
      mountainBike.accelerate();
      assertEquals( 10, mountainBike.currentSpeed() );
      mountainBike.brake();
      assertEquals(7, mountainBike.currentSpeed());
      mountainBike.stop();
      assertEquals(0, mountainBike.currentSpeed());
   }
}
