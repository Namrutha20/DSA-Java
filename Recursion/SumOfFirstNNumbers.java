/*
Problem: Sum of First N Numbers
Pattern: Recursion

Approach 1: Parameterized Recursion
Approach 2: Functional Recursion

Time Complexity: O(n)
Space Complexity: O(n)

Learning:
- Parameterized Recursion
- Functional Recursion
- Recursive Accumulation
*/

public class SumOfFirstNNumbers {

    // Parameterized Recursion
    static int parameterizedSum(int n, int sum) {

        if(n == 0) return sum;

        return parameterizedSum(n - 1, sum + n);
    }

    // Functional Recursion
    static int functionalSum(int n) {

        if(n == 0) return 0;

        return n + functionalSum(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Parameterized Recursion: "
                + parameterizedSum(n, 0));

        System.out.println("Functional Recursion: "
                + functionalSum(n));
    }
}
