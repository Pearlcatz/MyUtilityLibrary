package com.example;

/**
 * A simple String Utility Library.
 */
public class StringUtils {

    /**
     * Reverses a given string.
     * @param input the original string
     * @return reversed string
     */
    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Checks if a string is a palindrome.
     * @param input the original string
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        String reversed = reverse(input);
        return input.equalsIgnoreCase(reversed);
    }
}
