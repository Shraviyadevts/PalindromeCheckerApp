/**
 * ==========================================================
 * MAIN CLASS – PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * UC2 checks whether a predefined string is a palindrome.
 *
 * @author Developer
 * @version 2.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 2.0");
        System.out.println("System initialized successfully.");

        // UC2: Hardcoded Palindrome Check
        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
    }
}