//Approach 1: Iterative / Division Method
public class CountDigits {

    public static int countDigits(int n) {

        if (n == 0)
            return 1;

        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 12345;

        System.out.println("Number of digits: " + countDigits(n));
    }
}

//Approach 2: Logarithm Method
public class CountDigits {

    public static int countDigits(int n) {

        if (n == 0)
            return 1;

        return (int)(Math.log10(n) + 1);
    }

    public static void main(String[] args) {

        int n = 12345;

        System.out.println("Number of digits: " + countDigits(n));
    }
}
