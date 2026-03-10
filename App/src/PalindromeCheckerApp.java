// File: UseCase5PalindromeCheckerApp.java

import java.util.Stack;

public class giPalindromeCheckerApp {

    // Entry point of the application
    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "radar";

        // Display the word being checked
        System.out.println("Checking if \"" + word + "\" is a palindrome...");

        // Create a stack of characters
        Stack<Character> stack = new Stack<>();

        // Push each character into the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters to build the reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        if (word.equals(reversed)) {
            System.out.println("Result: \"" + word + "\" IS a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }

        // Program exits
        System.out.println("Program finished.");
    }
}




