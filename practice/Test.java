import java.util.Queue;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;

import java.util.Stack;

import java.util.ArrayList;
/*
Queue

boolean	offer(E e)
Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
E	peek()
Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
E	poll()
Retrieves and removes the head of this queue, or returns null if this queue is empty.
*/
/*
Stack

boolean	empty()
Tests if this stack is empty.
E	peek()
Looks at the object at the top of this stack without removing it from the stack.
E	pop()
Removes the object at the top of this stack and returns that object as the value of this function.
E	push(E item)
Pushes an item onto the top of this stack.
int	search(Object o)
Returns the 1-based position where an object is on this stack.
*/
/*
ArrayList

boolean	add(E e)
Appends the specified element to the end of this list.
void	clear()
Removes all of the elements from this list.
boolean	contains(Object o)
Returns true if this list contains the specified element.
E	get(int index)
Returns the element at the specified position in this list.
int	indexOf(Object o)
Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
boolean	isEmpty()
Returns true if this list contains no elements.
E	remove(int index)
Removes the element at the specified position in this list.
boolean	remove(Object o)
Removes the first occurrence of the specified element from this list, if it is present.
int	size()
Returns the number of elements in this list.
Object[]	toArray()
Returns an array containing all of the elements in this list in proper sequence (from first to last element).

排序ArrayList
Collections.sort()
*/
public class Test {
    public static void main(String[] argv) {
        System.out.println(" Queue ");
        testQueue();
        System.out.println(" Stack ");
        testStack();
        System.out.println(" ArrayList ");
        testArrayList();
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
        System.out.println();
        System.out.println();
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
        System.out.println();
    }

    public static void testArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(13);
        arrayList.add(11);
        arrayList.add(10);
        arrayList.add(25);
        arrayList.add(80);
        printCollection(arrayList);
        Collections.sort(arrayList);
        printCollection(arrayList);
        System.out.println("size = " + arrayList.size());
        System.out.println("contains 5 : " + arrayList.contains(5));
        System.out.println("是否為空 : " + arrayList.isEmpty());    
        int index = arrayList.indexOf(25); //只要有在動態陣列裡就傳回索引位置，如果沒有在陣列裡就傳回-1
        System.out.println("25的index : " + index);//剛剛找的b在1，所以會印出1
    }

    public static void printCollection(Collection data) {
        for (Object item : data) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}