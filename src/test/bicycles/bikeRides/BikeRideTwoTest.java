package bicycles.bikeRides;

//import org.junit.Before;
import main.bicycles.bikeride.BikeRideTwo;
import main.bicycles.models.MountainBike;
import main.bicycles.models.RoadBike;
import main.bicycles.models.Tendem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BikeRideTwoTest {
   @Test
   void ride() {
      //Mountain Bike
      MountainBike mountainBike1 = new MountainBike();
      BikeRideTwo bikeRideTwo = new BikeRideTwo(mountainBike1);
      bikeRideTwo.ride();
      Assertions.assertEquals( 10, mountainBike1.currentSpeed());

      //Road Bike
      RoadBike roadBike1 = new RoadBike();
      BikeRideTwo bikeRideOne2 = new BikeRideTwo(roadBike1);
      bikeRideOne2.ride();
      Assertions.assertEquals(22, roadBike1.currentSpeed());

      //Tandem Bike
      Tendem tendem = new Tendem();
      BikeRideTwo bikeRideOne3 = new BikeRideTwo(tendem);
      bikeRideOne3.ride();
      Assertions.assertEquals(24, tendem.currentSpeed());
   }
   
}
