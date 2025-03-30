/*
  This program checks whether a given string consists only of digits.
  Time complexity: O(n), where n is the length of the string.
  The method `isAllDigits` iterates through all characters in the string once, making a single pass (O(n)).

  @param s The input string to be checked.
  @return "yes" if the string contains only digits, otherwise "no".
*/

import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        System.out.println(isAllDigits(s) ? "yes" : "no"); // display yes if function returned True, and no otherwise.
    }
    public static boolean isAllDigits(String s) {
        if (s == null || s.isEmpty()) {
            return false; // if string is empty or null return False
        }
        for (char c : s.toCharArray()) { // converting string to array of chars and lookup each character in this array
            if (!Character.isDigit(c)) {
                return false; // if string isnt a number return False
            }
        }
        return true; // return True if all characters are numbers
    }
}
