package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int target = 5;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int index=0; index<nums.length; index++){
            if(map.containsKey(nums[index])) {
                result[0] = map.get(nums[index]);
                result[1] = index;
                return result;
            }
            map.put(target - nums[index], index);
        }
        return null;
    }
}