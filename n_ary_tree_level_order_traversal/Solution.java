import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public List<List<Integer>> levelOrder(Node root) {    
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
        
        // Because of Level-Order, we need a Queue
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            List<Integer> curLevel = new LinkedList<>();
            int curLevelLength = queue.size();
            
            for (int i = 0; i < curLevelLength; i++) {
                Node current = queue.poll();
                curLevel.add(current.val);
                for (Node children : current.children) {
                    queue.add(children);
                }
            }
            result.add(curLevel);
        }
        
        return result;
    }
}