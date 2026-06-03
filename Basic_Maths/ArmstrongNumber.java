public class ArmstrongNumber {

    public static boolean isArmstrong(int n) {

        int copy = n;
        int len = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;
            sum += Math.pow(digit, len);
            n /= 10;
        }

        return copy == sum;
    }

    public static void main(String[] args) {

        int n = 153;

        System.out.println(isArmstrong(n));
    }
}
