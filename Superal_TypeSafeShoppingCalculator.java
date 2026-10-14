/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.superal_typesafeshoppingcalculator;

/**
 *
 * @author natal
 */
public class Superal_TypeSafeShoppingCalculator {
    public static void main(String[] args) {
        int quantity = 5;
        double unitPrice = 10.55;
        String storeName = "Ata Aya's Store";
        
        //computation
        double totalCost = quantity * unitPrice;
 
        //output
        System.out.println("=== Purchase Summary ===");
        System.out.println("Store:      " + storeName);
        System.out.println("Quantity:   " + quantity);
        System.out.printf("Unit price: %.2f peso%n", unitPrice);
        System.out.printf("Total cost: %.2f peso%n", totalCost);
        
        /*
        *Why totalCost should NOT be an int:
        *Multiplying quantity by unitPrice produces a double because unitPrice
        *has decimal values. An int cannot store decimals, and converting a double
        *to an int removes the decimal part instead of rounding it. For example,
        *3 * 4.99 = 14.97 would become 14, losing the 97 centavo.
        *Therefore, totalCost should use a double to keep the decimal values.
        *(For real-world programs, BigDecimal is better for handling money
        *because it helps avoid rounding errors.)
        */
    }
}
