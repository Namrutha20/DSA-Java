public class ReverseInteger {

    public static int reverse(int x) {
      //Approach 1: Basic Reverse
      /*int rev = 0;

        while (x != 0) {

            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }

      */

      // Approach 2: Reverse with Overflow Handling
        int rev = 0;

        while (x != 0) {

            int digit = x % 10;

            if (rev > Integer.MAX_VALUE / 10 ||
                rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit;
            x /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        int x = 123;

        System.out.println(reverse(x));
    }
}
