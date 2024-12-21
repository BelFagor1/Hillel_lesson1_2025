package org.example;

public class Main {
    private static final double CONV_K = 2.20462;
    public static void main(String[] args) {
        System.out.println("Convert App.");
        double kgs = 5;
        double pounds = convertKgsToPounds(kgs);
        System.out.println("Result: " + pounds + " pounds.");
    }
    private static double convertKgsToPounds(double kgs) {
        return kgs * CONV_K;
    }
}