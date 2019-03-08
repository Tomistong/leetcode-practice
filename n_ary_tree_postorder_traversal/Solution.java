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
import java.util.*;

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        
        if (root == null) return result;
        
        stack.push(root);
        
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            result.add(temp.val);
            
            for (int i = 0; i < temp.children.size(); i++) {
                stack.push(temp.children.get(i));
            }
        }
        
        Collections.reverse(result);
        return result;
    }
}