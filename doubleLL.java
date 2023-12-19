import java.util.*;

public class doubleLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    // add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public static void main(String[] args) {
        doubleLL dll = new doubleLL();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        System.out.println(dll.size);

        dll.reverse();
        dll.print();
    }
}
