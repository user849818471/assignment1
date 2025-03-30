/*
  This method reads and prints n numbers in reverse order using recursion.
  Time complexity: O(n), where n is the number of elements.
  The function makes n recursive calls, each processing one element.
  Each call reads an integer and eventually prints it, both taking O(1) time.

  @param n The number of elements to read and print.
  @param scanner The Scanner object used for input.
 */

import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // entering the size of
        Reverse(n, scanner); // call recursive function
        scanner.close();
    }
    public static void Reverse(int n, Scanner scanner) {
        if (n == 0) {
            return; // stop if no elements are remained
        }
        int num = scanner.nextInt(); // read current number
        Reverse(n - 1, scanner); // call recursive function until n != 0
        System.out.print(num + " "); // print in reverse order
    }
}
