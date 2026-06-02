/*
Problem: Fibonacci Number
LeetCode: https://leetcode.com/problems/fibonacci-number/

Pattern: Recursion Tree

Time Complexity: O(2^n)
Space Complexity: O(n)

Learning:
- Multiple Recursive Calls
- Recursion Tree
- Overlapping Subproblems
- Foundation for Dynamic Programming
*/

public class FibonacciNumber {

    static int fib(int n) {

        if(n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(fib(n));
    }
}
