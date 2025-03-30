/*
  This method finds the minimum number from a list of given integers.
  It uses an iterative approach.
  Time complexity: O(n), where n is the number of integers.
  The algorithm iterates through all numbers once to find the minimum,
  resulting in linear time complexity.

  @param n The number of integers in the input.
  @return The minimum value among the given numbers.
 */

import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // entering n (number of iterations)
        int min = Integer.MAX_VALUE; // applying max value to min variable
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt(); // entering numbers
            if (num < min) {
                min = num; // if entered number is less than min, min variable will be updated to num
            }
        }
        System.out.println(min); // displaying minimum
    }
}
