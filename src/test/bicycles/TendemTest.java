package test.bicycles;

import main.bicycles.models.Tendem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TendemTest {
   Tendem tendem = new Tendem();
   
   @Test
   protected void accelerate() {
      assertEquals(0, tendem.currentSpeed());
      tendem.accelerate();
      assertEquals( 12, tendem.currentSpeed() );
   }
   
   @Test
   protected void brake() {
      assertEquals(0, tendem.currentSpeed());
      tendem.accelerate();
      tendem.accelerate();
      assertEquals( 24, tendem.currentSpeed() );
      tendem.brake();
      assertEquals(17, tendem.currentSpeed());
   }
}
