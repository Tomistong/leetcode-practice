import java.util.Queue;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Stack;
/*
Queue


boolean	offer(E e)
Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
E	peek()
Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
E	poll()
Retrieves and removes the head of this queue, or returns null if this queue is empty.

*/
public class Test {
    public static void main(String[] argv) {
        System.out.println(" Queue ");
        testQueue();
        System.out.println(" Stack ");
        testStack();
    }

    public static void testStack() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(10);
        stack.push(5);
        stack.push(8);
        stack.push(7);
        stack.push(55);
        printCollection(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        printCollection(stack);
        System.out.printf("stack: %d\n", stack.peek());
        System.out.printf("stack: %d\n", stack.peek());        
        printCollection(stack);
        System.out.printf("search 1: %d \n", stack.search(1)); //search from one to start
        stack.pop();
        stack.pop();
        System.out.print("Is Empty:");
        if (stack.empty()) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }

    }

    public static void testQueue() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(5);
        queue.offer(6);
        queue.offer(15);
        queue.offer(8);
        queue.offer(23);
        queue.offer(7);
        printCollection(queue);
        queue.poll();
        queue.poll();
        queue.poll();
        printCollection(queue);
        System.out.printf("peek: %d\n", queue.peek());
        System.out.printf("peek: %d\n", queue.peek());        
        printCollection(queue);
    }

    public static void printCollection(Collection data) {
        for (Object item : data) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}