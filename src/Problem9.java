/*
  This program calculates the binomial coefficient C(n, k) using recursion.
  Time complexity: O(2^n)
   The function makes two recursive calls for each value of (n, k), leading to an exponential growth in the number of function calls.
   This results in a recursive tree of depth n with 2^n total calls.

  @param n The total number of elements.
  @param k The number of elements to choose.
  @return The binomial coefficient C(n, k).
*/

import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // reading n
        int k = scanner.nextInt(); // reading k
        System.out.println(binomial(n, k)); // calling binomial function
    }
    public static int binomial(int n, int k) {
        if (k == 0 || k == n) { // basic cases when k = 0 or k = n return 1
            return 1;
        }
        return binomial(n - 1, k - 1) + binomial(n - 1, k); // using formula C(n,k)=C(n−1,k−1)+C(n−1,k) until k = 0 or k = n
    }
}