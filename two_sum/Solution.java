import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // put all array number in hashmap
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        // look for complement
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        return new int[] { 0, 0 };
    }
}