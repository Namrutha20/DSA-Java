/*
Problem: Check if a String is Palindrome Using Recursion
Pattern: Two Pointers + Recursion

Time Complexity: O(n)
Space Complexity: O(n)

Learning:
- String Traversal
- Two Pointers
- Recursive Comparison
- Base Condition Design
*/

public class PalindromeCheck {

    static boolean isPalindrome(String s, int left, int right) {

        if(left >= right)
            return true;

        if(s.charAt(left) != s.charAt(right))
            return false;

        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {

        String s = "madam";

        System.out.println(
            isPalindrome(s, 0, s.length() - 1)
        );
    }
}
