import java.util.ArrayList;

public class LowestCommonAncestor {

    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Change the type of the path parameter to ArrayList<Node>
    public boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        // Use the correct type for the path parameter
        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        // last equal node --> i-
        return i > 0 ? path1.get(i - 1) : null;
    }

    // approach 2

    public static Node lca2(Node root, int n1, int n2) {

        if (root == null || root.data == n1 || root.data == n2) {
            return root;

        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        // leftLCA rightLca = null
        if (rightLca == null) {
            return leftLca;

        }

        if (leftLca == null) {
            return rightLca;
        }

        return root;

    }

    public static void main(String[] args) {
        LowestCommonAncestor lca = new LowestCommonAncestor();

        Node root = lca.new Node(1);
        root.left = lca.new Node(2);
        root.right = lca.new Node(3);
        root.left.left = lca.new Node(4);
        root.left.right = lca.new Node(5);
        root.right.left = lca.new Node(6);
        root.right.right = lca.new Node(7);

        int n1 = 4, n2 = 7;
        System.out.println(lca.lca(root, n1, n2).data);
    }
}
