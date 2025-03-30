/*
  This method calculates the average of a given set of numbers.
  It uses an iterative approach.
  Time complexity: O(n), where n is the number of integers.
  The algorithm iterates through all numbers once to compute the sum,
  then performs a single division operation, resulting in linear time complexity.

  @param n The number of integers in the input.
  @return The average value of the given numbers.
 */

import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0; // defining sum as 0
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt(); // adding numbers to sum
        }
        double average = (double) sum / n; // calculating average of sum
        System.out.println(average); // displaying average
    }
}
