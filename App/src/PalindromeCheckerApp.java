import java.util.*;

public class PalindromeCheckerApp {

    // Stack-based palindrome check
    public static boolean stackPalindrome(String input) {

        String str = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Deque-based palindrome check
    public static boolean dequePalindrome(String input) {

        String str = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Stack algorithm timing
        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long endStack = System.nanoTime();

        // Deque algorithm timing
        long startDeque = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long endDeque = System.nanoTime();

        long stackTime = endStack - startStack;
        long dequeTime = endDeque - startDeque;

        System.out.println("\nResults:");
        System.out.println("Stack Strategy Result: " + (stackResult ? "Palindrome" : "Not Palindrome"));
        System.out.println("Stack Execution Time: " + stackTime + " ns");

        System.out.println("\nDeque Strategy Result: " + (dequeResult ? "Palindrome" : "Not Palindrome"));
        System.out.println("Deque Execution Time: " + dequeTime + " ns");

        scanner.close();
    }
}