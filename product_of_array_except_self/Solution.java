/**
 * 概念：
 * 我們用一個4個元素的陣列為例，nums=[a1, a2, a3, a4]。 
想在O(n)時間複雜度完成輸出，res=[a2*a3*a4, a1*a3*a4, a1*a2*a4, a2*a3*a4]。

比較好的解決方法是利用兩個陣列相乘：

fwdArray = [1, a1, a1*a2, a1*a2*a3]
bwdArray = [a2*a3*a4, a3*a4, a4, 1]

result = fwdArray * bwdArray
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] fwdArray = new int[nums.length];
        int[] bwdArray = new int[nums.length];
        
        int[] result = new int[nums.length];
        
        fwdArray[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            fwdArray[i] = fwdArray[i-1] * nums[i-1];
        }
        
        bwdArray[nums.length-1] = 1;
        for (int i = nums.length-2; i >= 0; i--) {
            bwdArray[i] = bwdArray[i+1] * nums[i+1];
        }
        
        for (int i = 0; i < nums.length; i++) {
            result[i] = fwdArray[i] * bwdArray[i];
        }
        
        return result;
    }
}