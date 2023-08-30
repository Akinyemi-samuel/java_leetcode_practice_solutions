package easy;

import java.util.Calendar;
import java.util.Date;

/*
 *Given an integer x, return true if x is a
 *palindrome and false otherwise.
 *
 *Example 1:
 *Input: x = 121
 *Output: true
 *Explanation: 121 reads as 121 from left to right and from right to left.
 */
public class Palindrome_Number {

    public static void main(String[] args) {
        System.out.println(isPalindromeTwoPointers(11211));
    }

    // SOLUTION 1
    public static boolean isPalindrome(int x) {
        String strx = String.valueOf(x);
        if (strx == null || strx.length() < 1) return false;
        StringBuilder stringBuilder = new StringBuilder(strx).reverse();
        return strx.contentEquals(stringBuilder);
    }

    // SOLUTION 2
    public static boolean isPalindromeLoop(int x) {
        String strx = String.valueOf(x);
        if (strx == null || strx.length() < 1) return false;
        String reversedString = "";
        for(char c : strx.toCharArray()){
            reversedString = c + reversedString;
        }
        return strx.contentEquals(reversedString);

    }

    // SOLUTION 3
    public static boolean isPalindromeTwoPointers(int x){
        String strx = String.valueOf(x);
        if (strx == null || strx.length() < 1) return false;

        for (int i = 0, j = strx.length() -1; i < j; i++, j--) {

            if (strx.charAt(i) == strx.charAt(j)){
                return true;
            }
        }
        return false;
    }
}
