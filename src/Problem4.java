/*
  This method calculates the factorial of a given number using recursion.
  Time complexity: O(n), where n is the input number.
  The algorithm makes n recursive calls, each reducing n by 1,
  leading to a linear time complexity.

  @param n The number whose factorial is to be calculated.
  @return The factorial of n.
 */


import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Undefined factorial"); // if number is less than 0 then factorial is undefined
        } else {
            int result = calculateFactorial(n); // if number is more than 0 function to find the factorial will be called and saved int result variable
            System.out.println(result); // result variable is displayed to the screen
        }
    }

    private static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // basic cases when number is 0 or 1, factorial will be 1
        }
        return n * calculateFactorial(n - 1); // recursive call that will multiply n to n-1 until is n != 0
    }
}