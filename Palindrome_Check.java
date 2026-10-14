/**
 * Problem: Valid Palindrome Check
 * Description: Determines whether a given string is a palindrome,
 * considering only alphanumeric characters and ignoring cases.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class PalindromeCheck {

    public static boolean isPalindrome(String s) {
        if (s == null) return false;

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters from left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric characters from right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters ignoring case
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";

        System.out.println("\"" + test1 + "\" is palindrome? " + isPalindrome(test1)); // true
        System.out.println("\"" + test2 + "\" is palindrome? " + isPalindrome(test2)); // false
    }
}
