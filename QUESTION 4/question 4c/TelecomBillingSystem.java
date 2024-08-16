/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.number4;

/**
 *

 */
public class TelecomBillingSystem {
    public static void main(String[] args) {
     
        double initialLoad = 10000.0;

    
        double chargePercentage = 10.0 / 100.0;
        double airtimeAfterCharge = initialLoad - (initialLoad * chargePercentage);

       
        int callDurationInSeconds = 5 * 60;

       
        double chargePerSecond = 200.0;

        
        double totalCallCost = callDurationInSeconds * chargePerSecond;

        
        double remainingBalance = airtimeAfterCharge - totalCallCost;

        // now display the balance
        System.out.println("Remaining balance after the call: UGX " + remainingBalance);
    }
}
