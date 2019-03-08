/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        
        if (root == null) return result;
        
        stack.push(root);
        
        while (!stack.isEmpty()) {
            Node item = stack.pop();
            result.add(item.val);
            
            for (int i = item.children.size() - 1; i >= 0; i--) {
                stack.push(item.children.get(i));
            }
        }
        
        return result;
    }
}