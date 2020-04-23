package main.bicycles.bikeRides;

import main.bicycles.Bicycle;

import main.bicycles.BicycleType;

import java.util.ArrayList;

public class FunRide {
   private ArrayList<Bicycle> bicycleArrayList = new ArrayList<Bicycle>();
   private int maxNumberOfBikes;
   
   public FunRide(int maxNumberOfBikes) {
      this.maxNumberOfBikes = maxNumberOfBikes;
   }

   public int getCountForType(BicycleType bikeType) {
      int bicycleTypeCounter = 0;
      
      for(Bicycle bicycle: bicycleArrayList) {
         if(bicycle.getBicycleType() == bikeType)
            bicycleTypeCounter++;
      }
      return bicycleTypeCounter;
   }
   
   public void accept(Bicycle bicycle){
    if( bicycleArrayList.size() < maxNumberOfBikes)
         bicycleArrayList.add(bicycle);
      else
         System.out.println("NotAdded: Error message");
   }
   
   
   public int getEnteredCount() {
      return bicycleArrayList.size();
   }
}
