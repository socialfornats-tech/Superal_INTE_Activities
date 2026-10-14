/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.superal_unitcastingconverter;

/**
 *
 * @author natal
 */
public class Superal_UnitCastingConverter {
    public static void main(String[] args) {
        // The length we want to convert, in centimeters
        double centimeters = 275.8;
 
        // Explicit narrowing cast: (int) removes the decimal part, leaving only the WHOLE meters.
        int wholeMeters = (int) (centimeters / 100);
 
        // Centimeters left over once the whole meters are taken out.
        // wholeMeters is an int, but Java automatically widens it to double in this subtraction.
        double remainingCm = centimeters - (wholeMeters * 100);
 
        System.out.println("=== Centimeter Conversion ===");
        System.out.printf("Input:     %.1f cm%n", centimeters);
        System.out.printf("Result:    %d m and %.1f cm%n", wholeMeters, remainingCm);
 
        // --- Implicit widening example (int -> double) ---
        int itemCount = 42;
        
        // No cast is needed here: a double is a bigger type that can hold any int exactly,
        // so Java converts it on its own and nothing is lost.
        double widenedCount = itemCount;
        System.out.println("\n=== Implicit Widening ===");
        System.out.println("int " + itemCount + " -> double " + widenedCount);
 
        // --- Explicit narrowing example (double -> int) ---
        double measurement = 9.99;
        
        // A cast is required because a double might not fit into an int.
        // What gets lost: the whole decimal part (.99). Java cuts it off instead of
        // rounding, so 9.99 turns into 9, not 10.
        int narrowedMeasurement = (int) measurement;
        System.out.println("\n=== Explicit Narrowing ===");
        System.out.println("double " + measurement + " -> int " + narrowedMeasurement);
    }
}
