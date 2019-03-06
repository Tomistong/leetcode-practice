/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.ArrayList;

class Solution {
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        
        inOrder(root, arrayList);
        
        for (int i = 1; i < arrayList.size(); i++) {
            min = Math.min(min, arrayList.get(i) - arrayList.get(i-1));
        }
        
        return min;
    }
    public void inOrder(TreeNode root, ArrayList arrayList) {
        if (root == null) {
            return;
        }
        inOrder(root.left, arrayList);
        arrayList.add(root.val);
        inOrder(root.right, arrayList);
    }
}