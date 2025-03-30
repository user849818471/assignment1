/*
  This method checks whether a given number is prime or composite.
  It uses an iterative approach with an optimized loop running up to sqrt(n).
  Time complexity: O(√n), where n is the input number.
  The algorithm iterates only up to the square root of n, reducing the number of checks
  compared to a O(n) approach.

  @param n The number to be checked.
  @return "Prime" if the number is prime, "Composite" otherwise.
 */

import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Composite");  // Numbers <=1 are not prime
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { // checking for having a divider
                System.out.println("Composite");
                return; // If divider was found, ending the programm
            }
        }
        System.out.println("Prime"); // If divider isnt found, number is prime
    }
}
