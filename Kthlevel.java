import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Kthlevel {

    public static void KLevel(Node root, int level, int K) {
        if (root == null) {
            return;
        }

        if (level == K) {
            System.out.print(root.data + " ");
        }
        KLevel(root.left, level + 1, K);
        KLevel(root.right, level + 1, K);

    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int K = 2;

        // Call the KLevel method with the provided parameters
        KLevel(root, 1, K);
    }
}
