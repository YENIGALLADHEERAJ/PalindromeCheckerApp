/**
 * MAIN CLASS - PalindromeCheckerApp
 * Use Case 2: Hardcoded Palindrome Validation
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 2.0");

        // UC2: Hardcoded Palindrome Logic
        String input = "radar"; // Predefined string
        boolean isPalindrome = true;

        // Loop only till half of the string length (Hint provided)
        for (int i = 0; i < input.length() / 2; i++) {
            // Compare character from start with character from end
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        if (isPalindrome) {
            System.out.println("The string '" + input + "' is a Palindrome.");
        } else {
            System.out.println("The string '" + input + "' is NOT a Palindrome.");
        }
    }
}
