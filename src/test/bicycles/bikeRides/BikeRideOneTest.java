package bicycles.bikeRides;

import main.bicycles.bikeride.BikeRideOne;
import main.bicycles.models.MountainBike;
import main.bicycles.models.RoadBike;
import main.bicycles.models.Tendem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BikeRideOneTest {
   
   @Test
   void ride() {
      //Mountain Bike
      MountainBike mountainBike1 = new MountainBike();
      BikeRideOne bikeRideOne1 = new BikeRideOne(mountainBike1);
      bikeRideOne1.ride();
      assertEquals( 7, mountainBike1.currentSpeed());
   
      //Road Bike
      RoadBike roadBike1 = new RoadBike();
      BikeRideOne bikeRideOne2 = new BikeRideOne(roadBike1);
      bikeRideOne2.ride();
      assertEquals(18, roadBike1.currentSpeed());
   
      //Tandem Bike
      Tendem tendem = new Tendem();
      BikeRideOne bikeRideOne3 = new BikeRideOne(tendem);
      bikeRideOne3.ride();
      assertEquals(17, tendem.currentSpeed());
   }
   
}