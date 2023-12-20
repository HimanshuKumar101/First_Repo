import java.util.*;

public class KthAncestorofNode {

    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public int KAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        if (max + 1 == k) {
            System.out.println(root.data);
        }

        return max + 1;
    }

    public static void main(String[] args) {
        KthAncestorofNode lca = new KthAncestorofNode();

        Node root = lca.new Node(1);
        root.left = lca.new Node(2);
        root.right = lca.new Node(3);
        root.left.left = lca.new Node(4);
        root.left.right = lca.new Node(5);
        root.right.left = lca.new Node(6);
        root.right.right = lca.new Node(7);

        int n = 5;
        int k = 2; // fix the variable name here
        lca.KAncestor(root, n, k);
    }
}
