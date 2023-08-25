package easy;

/*
 * Write a function to find the longest common prefix
 *  string amongst an array of strings.
 *  If there is no common prefix, return an empty string "".
 *
 *  Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String s2 = "";

        //Get the first element of the array to be used to compare with other element in the array
        // for matching characters
        String prev = strs[0];


        for (int i = 0; i < strs.length; i++) {

            int j = 0;

            //check if the current element in the array is equal to the previous element that was looped
            while (j < strs[i].length() && strs[i].charAt(j) == prev.charAt(j)) {
                j++;
            }

            //assign the previous element of the array to the variable
            prev = prev + strs[i];

            //get the index of the matching characters between the elements in the array
            s2 = strs[i].substring(0, j);
        }
        return s2;

    }
}
