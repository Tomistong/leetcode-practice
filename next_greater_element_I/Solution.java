import java.util.Arrays;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];      
        Arrays.fill(result, -1);
        
        for (int i = 0; i < nums1.length; i++) {
            int iLocationInNums2 = indexOf(nums2, nums1[i]);
            for (int j = iLocationInNums2; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    result[i] = nums2[j];
                    break;
                } 
            }
        }
        return result;
    }
    
    public int indexOf(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }    
        }        
        return -1;
    }
}