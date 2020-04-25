package main.bicycles.bikeRides;

import main.bicycles.BikeRide;
import main.bicycles.specification.BicycleFromSpec;
import main.bicycles.BicycleType;

import javax.swing.*;
import java.util.ArrayList;

public class FunRide {
   private ArrayList<BicycleFromSpec> bicycleFromSpecArrayList = new ArrayList<BicycleFromSpec>();
   private int maxNumberOfBikes;
   
   public FunRide(int maxNumberOfBikes) {
      this.maxNumberOfBikes = maxNumberOfBikes;
   }

   public int getCountForType(BicycleType bicycleType) {
      int bicycleTypeCounter = 0;

      for(BicycleFromSpec bicycle: bicycleFromSpecArrayList) {
         if(bicycle.getBicycleType() == bicycleType)
            bicycleTypeCounter++;
      }
      return bicycleTypeCounter;
   }
   
   public void accept(BicycleFromSpec bicycleFromSpec) {
      if( (bicycleFromSpecArrayList.size() < maxNumberOfBikes) && !(bicycleFromSpecArrayList.contains(bicycleFromSpec)) )
         bicycleFromSpecArrayList.add(bicycleFromSpec);
   }
   
   public int getEnteredCount() {
      return bicycleFromSpecArrayList.size();
   }
}
