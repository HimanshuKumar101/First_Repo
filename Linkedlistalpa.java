import java.util.*;

public class Linkedlistalpa {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step1 = create a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;

        }

        // step 2 newnode next = head
        newNode.next = head; // link

        // step 3 head = newnode
        head = newNode;

    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;

        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp --> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL IS EMPTY");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev: i = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // search iterative search for a key in a linked list. return the position where
    // it is found
    // if not found return -1

    public int iterativesearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;

            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    /* search using recursive */

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;

    }

    public int recsearch(int key) {
        return helper(head, key);
    }

    /*
     * reverse a linked list
     * iterative approach
     */
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    /*
     * check if LL is a palindrome
     * 1) find mid Node
     * 2) 2nd half reverse
     * 3) check if 1st half == 2nd half (right)
     * slow = head +1
     * fat = head +2
     * 
     */
    // slow fast approach
    public Node findMid(Node head) { // helper
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // 2
        }
        return slow; // slow is my midnode
    }

    public boolean checkpalindrome() {
        if (head == null || head.next == null) {
            return true;

        }
        // step 1 find mid
        Node midNode = findMid(head);

        // step 2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        Node right = prev; // right half head
        Node left = head;

        // step 3 check left half & right half

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Linkedlistalpa ll = new Linkedlistalpa();
        /*
         * ll.print();
         * ll.addFirst(2);
         * ll.print();
         * ll.addFirst(1);
         * ll.print();
         * ll.addLast(3);
         * ll.print();
         * ll.addLast(4);
         * ll.print();
         * ll.add(2, 9);
         * 
         * ll.print();
         * System.out.println(ll.size);
         * ll.removeFirst();
         * ll.print();
         * System.out.println(ll.size);
         * 
         * ll.removeLast();
         * ll.print();
         * System.out.println(ll.size);
         * 
         * System.out.println(ll.iterativesearch(3));
         * System.out.println(ll.iterativesearch(10));
         * System.out.println(ll.recsearch(3));
         * System.out.println(ll.recsearch(10));
         * 
         * ll.print();
         * ll.reverse();
         * ll.print();
         */

        // check palindorm
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        // ll.addLast(1);

        ll.print();

        System.out.println(ll.checkpalindrome());

    }
}