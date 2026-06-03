public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        if (x < 0)
            return false;

        int copy = x;
        int rev = 0;

        while (x > 0) {

            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }

        return copy == rev;
    }

    public static void main(String[] args) {

        int x = 121;

        System.out.println(isPalindrome(x));
    }
}
