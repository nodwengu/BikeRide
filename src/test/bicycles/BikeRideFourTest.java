package test.bicycles;

import main.bicycles.bikeRides.BikeRideFour;
//import org.junit.Before;
import main.bicycles.bikeRides.BikeRideThree;
import main.bicycles.models.MountainBike;
import main.bicycles.models.RoadBike;
import main.bicycles.models.Tendem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BikeRideFourTest {
   @Test
   void ride() {
      //Mountain Bike
      MountainBike mountainBike = new MountainBike();
      BikeRideFour bikeRideThree1 = new BikeRideFour(mountainBike);
      bikeRideThree1.ride();
      Assertions.assertEquals( 15, mountainBike.currentSpeed());
      
      //Road Bike
      RoadBike roadBike1 = new RoadBike();
      BikeRideFour bikeRideFour2 = new BikeRideFour(roadBike1);
      bikeRideFour2.ride();
      Assertions.assertEquals(33, roadBike1.currentSpeed());
      
      //Tandem Bike
      Tendem tendem = new Tendem();
      BikeRideFour bikeRideFour3 = new BikeRideFour(tendem);
      bikeRideFour3.ride();
      Assertions.assertEquals(36, tendem.currentSpeed());
   }
   
   @Test
   void testRide() {
      //Mountain Bike
      MountainBike mountainBike1 = new MountainBike();
      BikeRideFour bikeRideFour1 = new BikeRideFour(mountainBike1);
      bikeRideFour1.ride(mountainBike1);
      //System.out.println(mountainBike1.currentSpeed());
      Assertions.assertEquals( 30, mountainBike1.currentSpeed());

      //Road Bike
      RoadBike roadBike1 = new RoadBike();
      BikeRideFour bikeRideFour2 = new BikeRideFour(roadBike1);
      bikeRideFour2.ride(roadBike1);
      Assertions.assertEquals(66, roadBike1.currentSpeed());

      //Tandem Bike
      Tendem tendem = new Tendem();
      BikeRideFour bikeRideFour3 = new BikeRideFour(tendem);
      bikeRideFour3.ride(tendem);
      //System.out.println(tendem.currentSpeed());
      Assertions.assertEquals(72, tendem.currentSpeed());
   }
}
