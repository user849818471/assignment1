/*
  This method calculates the power of a number using recursion.
  Time complexity: O(n), where n is the exponent.
  The function makes n recursive calls, each reducing n by 1,
  leading to a linear time complexity.


  @param a The base number.
  @param n The exponent.
  @return The result of a^n.
 */

import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(power(a, n)); // calling recursive function to find the power n of the number a
    }
    public static int power(int a, int n) {
        if (n == 0) {
            return 1; // if n (power) is equal to 0 return 1 (power 0 of any number equal to 1)
        } else {
            return a * power(a, n - 1); // if its not equal to 0 will call power function recursively until n is not 0
        }
    }
}