import java.util.*;

public class AVLTrees {

    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

    public static int height(Node root) {
        if (root == null)
            return 0;

        return root.height;

    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int getBalance(Node root) {
        if (root == null)
            return 0;

        return height(root.left) - height(root.right);
    }

    public static Node insert(Node root, int key) {
        if (root == null)
            return new Node(key);
        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        else
            return root; // duplicate keys not allowed

        // update root height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // get root's balance factor
        int bf = getBalance(root);

        // Left left case

        if (bf > 1 && key < root.left.data)
            return rightRotate(root);

    }

    public static void main(String[] args) {

        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

    }
}