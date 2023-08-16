package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 *Given an array of integers nums and an integer target, return indices of
 * the two numbers such that they add up to target.

 *You may assume that each input would have exactly one solution, and you
 * may not use the same element twice.

 *You can return the answer in any order.

 *Example 1:
 *Input: nums = [2,7,11,15], target = 9
 *Output: [0,1]
 *Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class Two_Sum {



    public static void main(String[] args) {
        int[] nums ={ 2,7,11,15 };
        System.out.println(Arrays.toString(getIndices(nums, 9)));
    }

  public static int[] getIndices(int[] nums, int target) {

        Map<Integer, Integer> indices = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            int complement  = target - nums[i];

            if (indices.containsKey(complement)){
                return new int[]{indices.get(complement), i};
            }

            indices.put(nums[i], i);
        }

      return new int[]{};
    }
}
