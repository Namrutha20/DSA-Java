/*
Problem: Print N to 1
Pattern: Basic Recursion

Time Complexity: O(n)
Space Complexity: O(n)

Learning:
- Base Condition
- Recursive Calls
- Recursion Stack
*/

public class PrintNTo1 {

    static void printNumbers(int n) {

        if(n == 0) return;

        System.out.println(n);

        printNumbers(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        printNumbers(n);
    }
}
