import java.util.*;

public class PrintDivisors {

    public static List<Integer> divisors(int n) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {

                list.add(i);

                if (i != n / i)
                    list.add(n / i);
            }
        }

        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {

        int n = 36;

        System.out.println(divisors(n));
    }
}
