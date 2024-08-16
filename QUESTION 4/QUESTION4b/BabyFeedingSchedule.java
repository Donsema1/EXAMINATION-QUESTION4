/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.number4;

/**
 *
 
 */

public class BabyFeedingSchedule {
    public static void main(String[] args) {
      
        double porridgeVolume = 2.0; 
        double milkVolume = 2.0; 
        double cupVolume = 0.5; 
        int porridgeInterval = 45; 
        int milkInterval = 30; 

      
        int totalPorridgeCups = (int) (porridgeVolume / cupVolume);
        int totalMilkCups = (int) (milkVolume / cupVolume);
        
        
        int totalPorridgeTime = (totalPorridgeCups * porridgeInterval) + (totalPorridgeCups - 1) * porridgeInterval;
        
       
        int totalMilkTime = (totalMilkCups * milkInterval) + (totalMilkCups - 1) * milkInterval;

        
        int totalTime = Math.max(totalPorridgeTime, totalMilkTime);

       
        int hours = totalTime / 60;
        int minutes = totalTime % 60;

       
        System.out.println("Total time to finish both porridge and milk: " + hours + " hours and " + minutes + " minutes.");
    }
}
