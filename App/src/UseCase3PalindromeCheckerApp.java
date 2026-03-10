// File: UseCase3PalindromeCheckerApp.java

public class UseCase3PalindromeCheckerApp {

    // Entry point of the application
    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "racecar";

        // Display the word being checked
        System.out.println("Checking if \"" + word + "\" is a palindrome...");

        // Reverse the string manually using a loop
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i); // string concatenation
        }

        // Compare original and reversed using equals()
        if (word.equals(reversed)) {
            System.out.println("Result: \"" + word + "\" IS a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }

        // Program exits
        System.out.println("Program finished.");
    }
}





