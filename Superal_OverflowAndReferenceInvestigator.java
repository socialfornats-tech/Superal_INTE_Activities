/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.superal_overflowandreferenceinvestigator;

/**
 *
 * @author natal
 */
public class Superal_OverflowAndReferenceInvestigator {

     public static void main(String[] args) {
        double centimeters = 275.8;
        
        // Convert to whole meters by removing the decimal part.
        int wholeMeters = (int) (centimeters / 100);
 
        // Get the remaining centimeters after converting to meters.
        // wholeMeters is automatically converted to double during multiplication.
        double remainingCm = centimeters - (wholeMeters * 100);
 
        System.out.println("=== Centimeter Conversion ===");
        System.out.printf("Input:     %.1f cm%n", centimeters);
        System.out.printf("Result:    %d m and %.1f cm%n", wholeMeters, remainingCm);

        // --- Implicit widening example (int -> double) ---
        int itemCount = 42;

        // Java automatically converts int to double because double can store it exactly.
        double widenedCount = itemCount;
        System.out.println("\n=== Implicit Widening ===");
        System.out.println("int " + itemCount + " -> double " + widenedCount);

         // --- Explicit narrowing example (double -> int) --
        double measurement = 9.99;

        // A cast is needed to convert double to int.
        // The decimal part is removed, so 9.99 becomes 9 instead of 10.
        int narrowedMeasurement = (int) measurement;
        System.out.println("\n=== Explicit Narrowing ===");
        System.out.println("double " + measurement + " -> int " + narrowedMeasurement);
    }
}
