/**
 * ==========================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This program demonstrates palindrome checking using
 * Object-Oriented Programming principles.
 *
 * The palindrome logic is encapsulated inside the
 * PalindromeChecker class.
 *
 * Concepts Used:
 * - Encapsulation
 * - Single Responsibility Principle
 *
 * Data Structure:
 * - Internal Array comparison
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}

/**
 * PalindromeChecker class encapsulates palindrome logic.
 */
class PalindromeChecker {

    /**
     * Checks whether the given string is a palindrome.
     *
     * @param str Input string
     * @return true if palindrome, otherwise false
     */
    public boolean checkPalindrome(String str) {

        String normalized = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {

            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}