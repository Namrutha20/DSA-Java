/*
Problem: Print 1 to N
Pattern: Basic Recursion

Time Complexity: O(n)
Space Complexity: O(n)

Learning:
- Base Condition
- Recursive Calls
- Call Stack
*/

public class Print1ToN {

    static void printNumbers(int i, int n) {

        if(i > n) return;

        System.out.println(i);

        printNumbers(i + 1, n);
    }

    public static void main(String[] args) {

        int n = 5;

        printNumbers(1, n);
    }
}
