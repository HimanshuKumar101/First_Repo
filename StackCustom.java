import java.util.*;

public class StackCustom {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // public static class Stackb {

    // Stack using array

    // static ArrayList<Integer> list = new ArrayList<>();**

    // public static boolean isEmpty() {
    // return list.isEmpty();
    // }

    // push
    // public static void push(int data) {
    // list.add(data);
    // }
    /*
     * // pop
     * public static int pop() {
     * if (isEmpty()) {
     * // throw new EmptyStackException();
     * return -1;
     * }
     * int top = list.get(list.size() - 1);
     * list.remove(list.size() - 1);
     * return top;
     * }
     * 
     * // peek
     * 
     * public static int peek() {
     * if (isEmpty()) {
     * throw a EmptyStackException();
     * }
     * return list.get(list.size() - 1);
     * }
     */

    // stack using LinkedList

    /*
     * static Node head = null;
     * 
     * public static boolean isEmpty() {
     * return head == null;
     * }
     * 
     * // push
     * public static void push(int data) {
     * Node newNode = new Node(data);
     * if (isEmpty()) {
     * head = newNode;
     * return;
     * }
     * 
     * newNode.next = head;
     * head = newNode;
     * }
     * // pop
     * 
     * public static int pop() {
     * if (isEmpty()) {
     * return -1;
     * }
     * 
     * int top = head.data;
     * head = head.next;
     * return top;
     * }
     * 
     * // peek
     * 
     * public static int peek() {
     * if (isEmpty()) {
     * return -1;
     * }
     * return head.data;
     * }
     */

    // }

    public static void main(String[] args) {

        // java.util.Stack<Integer> s = new java.util.Stack<>();
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
