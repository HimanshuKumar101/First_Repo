import java.util.*;

public class TransformtoSumTree {
    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public int transform(Node root) {
        if (root == null) {
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;
        return data;
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        TransformtoSumTree transformer = new TransformtoSumTree();

        Node root = transformer.new Node(1);
        root.left = transformer.new Node(2);
        root.right = transformer.new Node(3);
        root.left.left = transformer.new Node(4);
        root.left.right = transformer.new Node(5);
        root.right.left = transformer.new Node(6);
        root.right.right = transformer.new Node(7);

        transformer.transform(root);
        transformer.preorder(root);
    }
}
