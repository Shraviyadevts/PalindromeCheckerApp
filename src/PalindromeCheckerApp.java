/**
 * =====================================================
 * MAIN CLASS – UseCase6PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using both
 * Queue (FIFO) and Stack (LIFO) data structures.
 *
 * At this stage, the application:
 * - Enqueues characters into a queue
 * - Pushes characters into a stack
 * - Compares dequeue with pop
 * - Displays the result
 *
 * This demonstrates FIFO vs LIFO behavior.
 *
 * @author Developer
 * @version 6.0
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Declare and initialize the input string
        String input = "civic";

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into Queue and Stack
        for (char c : input.toCharArray()) {
            queue.add(c);   // enqueue
            stack.push(c);  // push
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare dequeue and pop
        while (!queue.isEmpty()) {

            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}