package easy;

/*
 *   Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

 *Symbol       Value
 *I             1
 *V             5
 *X             10
 *L             50
 *C             100
 *D             500
 *M             1000
 *For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

 *Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

 *I can be placed before V (5) and X (10) to make 4 and 9.
 *X can be placed before L (50) and C (100) to make 40 and 90.
 *C can be placed before D (500) and M (1000) to make 400 and 900.
 *Given a roman numeral, convert it to an integer.

 *Example 1:

 *Input: s = "III"
 *Output: 3
 *Explanation: III = 3.
 */

import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {

    private static int nextNumerals;

    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentNumeral = roman.get(s.charAt(i));
            int nextNumerals = 0;

            //get the next numerals value and if it is the last numerals then the value of next is zero
            if (i < s.length() - 1) {
                nextNumerals = roman.get(s.charAt(i + 1));
            }

            if (currentNumeral < nextNumerals) {
                total -= currentNumeral;

            } else {
                total += currentNumeral;
            }

        }

        return total;

    }
}
