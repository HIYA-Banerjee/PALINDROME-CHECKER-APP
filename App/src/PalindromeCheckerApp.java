public class PalindromeCheckerApp {
    static void main(String[] args) {
                // Hardcoded string to check
                String word = "madam";

                // Display the word being checked
                System.out.println("Checking if \"" + word + "\" is a palindrome...");

                // Reverse the string
                String reversed = new StringBuilder(word).reverse().toString();

                // Check palindrome condition using if-else
                if (word.equals(reversed)) {
                    System.out.println("Result: \"" + word + "\" IS a palindrome.");
                } else {
                    System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
                }

                // Program exits
                System.out.println("Program finished.");
            }
        }




