import org.junit.jupiter.api.Test;
import main.bicycles.models.*;
import main.bicycles.bikeRides.*;

import static org.junit.jupiter.api.Assertions.*;

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
   
   @Test
   void testRide() {
      //Mountain Bike
      MountainBike mountainBike1 = new MountainBike();
      BikeRideOne bikeRideOne1 = new BikeRideOne(mountainBike1);
      bikeRideOne1.ride(mountainBike1);
      //System.out.println(mountainBike1.currentSpeed());
      assertEquals( 10, mountainBike1.currentSpeed());
   
      //Road Bike
      RoadBike roadBike1 = new RoadBike();
      BikeRideOne bikeRideOne2 = new BikeRideOne(roadBike1);
      bikeRideOne2.ride(roadBike1);
      assertEquals(22, roadBike1.currentSpeed());

      //Tandem Bike
      Tendem tendem = new Tendem();
      BikeRideOne bikeRideOne3 = new BikeRideOne(tendem);
      bikeRideOne3.ride(tendem);
      //System.out.println(tendem.currentSpeed());
      assertEquals(24, tendem.currentSpeed());
   }
}