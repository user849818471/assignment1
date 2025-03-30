/*
   This function calculates the greatest common divisor (GCD) using the Euclidean algorithm with recursion.
   Time complexity: O(log(min(a, b)))
   Each recursive step reduces one of the numbers significantly
   The number of recursive calls is approximately proportional to log(min(a, b))

  @param a The first number.
  @param b The second number.
  @return The greatest common divisor of a and b.
*/

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // reading a
        int b = scanner.nextInt(); // reading b
        System.out.println(gcd(a, b)); // calling recursive function to find great common divisor
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // if b = 0 return a as greatest common divisor
        }
        return gcd(b, a % b); // calling recursive function until b = 0
    }
}
