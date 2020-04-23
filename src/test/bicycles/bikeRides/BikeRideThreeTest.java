package bicycles.bikeRides;

import main.bicycles.bikeRides.BikeRideThree;
import main.bicycles.bikeRides.BikeRideTwo;
import main.bicycles.models.MountainBike;
import main.bicycles.models.RoadBike;
import main.bicycles.models.Tendem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BikeRideThreeTest {
   @Test
   void ride() {
      //Mountain Bike
      MountainBike mountainBike = new MountainBike();
      BikeRideThree bikeRideThree1 = new BikeRideThree(mountainBike);
      bikeRideThree1.ride();
      Assertions.assertEquals( 65, mountainBike.currentSpeed());
      
      //Road Bike
      RoadBike roadBike1 = new RoadBike();
      BikeRideThree bikeRideThree2 = new BikeRideThree(roadBike1);
      bikeRideThree2.ride();
      Assertions.assertEquals(143, roadBike1.currentSpeed());
      
      //Tandem Bike
      Tendem tendem = new Tendem();
      BikeRideThree bikeRideThree3 = new BikeRideThree(tendem);
      bikeRideThree3.ride();
     
      Assertions.assertEquals(156, tendem.currentSpeed());
   }
   
   @Test
   void testRide() {
      //Mountain Bike
      MountainBike mountainBike1 = new MountainBike();
      BikeRideThree bikeRideThree1 = new BikeRideThree(mountainBike1);
      bikeRideThree1.ride(mountainBike1);
    
      Assertions.assertEquals( 120, mountainBike1.currentSpeed());
      
      //Road Bike
      RoadBike roadBike1 = new RoadBike();
      BikeRideThree bikeRideThree2 = new BikeRideThree(roadBike1);
      bikeRideThree2.ride(roadBike1);
      Assertions.assertEquals(264, roadBike1.currentSpeed());
      
      //Tandem Bike
      Tendem tendem = new Tendem();
      BikeRideThree bikeRideThree3 = new BikeRideThree(tendem);
      bikeRideThree3.ride(tendem);
     
      Assertions.assertEquals(288, tendem.currentSpeed());
   }
}
