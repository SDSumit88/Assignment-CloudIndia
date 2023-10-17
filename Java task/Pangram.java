package com.task;

import java.util.HashSet;

public class Pangram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input string
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Remove spaces and convert the input to lowercase for case insensitivity
        input = input.replaceAll("\\s", "").toLowerCase();

        // Create a HashSet to store unique characters
        HashSet<Character> uniqueChars = new HashSet<>();

        // Iterate through the input and add each character to the HashSet
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueChars.add(c);
            }
        }

        // Check if the HashSet size is 26 (the number of letters in the English alphabet)
        return uniqueChars.size() == 26;
    }
}
