package com.example;

/**
 * A simple Math Utility Library.
 */
public class MathUtils {

    /**
     * Adds two numbers.
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Multiplies two numbers.
     * @param a first number
     * @param b second number
     * @return product of a and b
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Finds the maximum of two numbers.
     * @param a first number
     * @param b second number
     * @return larger of a and b
     */
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}
