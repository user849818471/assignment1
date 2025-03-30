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
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
        scanner.close();
    }
}
