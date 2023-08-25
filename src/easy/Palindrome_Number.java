package easy;

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
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {

        // SOLUTION 1
        String strx = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder(strx).reverse();
        return strx.contentEquals(stringBuilder);


       // SOLUTION 2
//        String reversedString = "";
//        for(char c : strx.toCharArray()){
//            reversedString = c + reversedString;
//        }
//        return strx.contentEquals(reversedString);

    }
}
