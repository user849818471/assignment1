/*
  This method calculates the nth Fibonacci number using recursion.
  Time complexity: O(2^n), where n is the input number.
  The recursive approach leads to an exponential number of function calls,
  as each call to fib(n) branches into two more calls (fib(n-1) and fib(n-2)).

  @param n The position in the Fibonacci sequence.
  @return The nth Fibonacci number.
 */

import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n)); //calling recursive function to find fibonacci
    }
    public static int fib(int n) {
        if (n == 0) return 0; // basic case
        if (n == 1) return 1; // basic case
        return fib(n - 1) + fib(n - 2); // calculating fibonacci number until n is not 1 or 0
    }
}