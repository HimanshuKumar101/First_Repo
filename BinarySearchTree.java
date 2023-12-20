import java.util.ArrayList;

public class BinarySearchTree {
    /*
     * binary tree
     * 
     * a> Left Subtree Nodes < root
     * b> Right Subtree Nodes > Root
     * c> Left & Right Subtrees are also BST with no duplicates
     * 
     * Inorder Traversal of BST gives a sorted sequence
     * 
     * BST SEARCH
     * tO REMember: BST MAKES search efficient
     * 
     * key > data
     * go high
     * 
     * key < data
     * go left
     * 
     * key = 8
     * 
     * key = 3
     * 
     * O(H) Height of tree
     * 
     * Balanced BST --> LOG n << n
     * 1
     * \ SKEWED TREE
     * 2
     * \
     * 3
     * \
     * 4
     * 
     * STRATEGY
     * 
     * mOST PROBlems will be solved using recursion by dividing
     * into subproblems & making recursive calls on subtrees.
     * 
     * 
     */
    // Build a BST
    // values[] = {5,1,3,4,2,7}
    /*
     * 5
     * / \
     * 1 7
     * \
     * 3 // 1 2 3 4 5 7 inorder is Sorted
     * / \
     * 2 4
     * 
     * values[i] > root --> right subtree
     * values[i] < root --> left subtree
     */
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static class BST {

        public static Node insert(Node root, int val) {
            if (root == null) {
                root = new Node(val);
                return root;
            }

            if (root.data > val) {
                // left subtree
                root.left = insert(root.left, val);

            } else {
                // right subtree
                root.right = insert(root.right, val);

            }
            return root;

        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static boolean search(Node root, int key) {
            if (root == null) {
                return false;
            }

            if (root.data == key) {
                return true;
            }
            if (root.data > key) {
                return search(root.left, key);

            } else {
                return search(root.right, key);
            }
        }
        /*
         * delete a node
         * 
         * 1> no child (leaf node)
         * 
         * delete node
         * & Return NUll to parent
         * 
         * 2> on child 4
         *
         * delete node
         * & REplace with child node
         * 
         * 
         * 3> two children
         * 
         * replace value with inorder successor
         * delete node node for inorder successor
         *
         * inorder successor ==> left most node in right subtree
         * in bst
         * 
         * inorder successor always has 0 or 1 child
         * 
         */

        public static Node delete(Node root, int val) {
            if (root.data < val) {
                root.right = delete(root.right, val);

            } else if (root.data > val) {
                root.left = delete(root.left, val);
            } else { // voila
                     // case 1 leaf node
                if (root.left == null && root.right == null) {
                    return null;
                }

                // case 2. -- single child
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }

                // case 3 -- both children

                Node IS = findInorderSuccessor(root.right);
                root.data = IS.data;
                delete(root.right, IS.data);

            }
            return root;
        }

        public static Node findInorderSuccessor(Node root) {
            while (root.left != null) {
                root = root.left;
            }
            return root;

        }

        /*
         * Print in range
         * 
         * K1 = 5 and K2 = 12
         * 
         * case1
         * K1 <= root <= K2
         * Left side
         * right side
         * 
         * 
         * case 2
         * root > k2
         * right side
         * 
         * case 3
         * root < k1
         * left side
         * 
         * 
         */

        public static void printInRange(Node root, int k1, int k2) {
            if (root == null) {
                return;
            }
            if (root.data >= k1 && root.data <= k2) {
                printInRange(root.left, k1, k2);
                System.out.print(root.data + " ");
                printInRange(root.right, k1, k2);
            } else if (root.data < k1) {
                printInRange(root.left, k1, k2);
            } else {
                printInRange(root.right, k1, k2);
            }
        }

        /*
         * ROOT TO LEAF PATHS
         *
         * 
         * ADD(NODE ) TO PATH
         * LEFT SUBTREE
         * RIGHT SUBTREE
         */

        public static void printPath(ArrayList<Integer> path) {
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i) + " ");
            }
            System.out.println("Null");
        }

        public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
            if (root == null) {
                return;
            }
            path.add(root.data);
            if (root.left == null && root.right == null) {
                printPath(path);
            }
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
            path.remove(path.size() - 1);
        }

        // VALIDATE BST

        /*
         * 
         * approach 1
         * 
         * compare with left & right node
         * 
         * every element of left child should be less than root
         * 
         * the inorder traversal should be sorted
         * 
         * approach 2
         * 
         * check if max value in left subtree < node
         * 
         * and min value in right subtree > node
         * 
         * 
         */

        public static boolean isValidBST(Node root, Node min, Node max) {
            if (root == null) {
                return true;
            }
            if (min != null && root.data <= min.data) {
                return false;
            } else if (max != null && root.data >= max.data) {
                return false;
            }

            return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
        }
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = BST.insert(root, values[i]);
        }

        // Uncomment the following lines if needed
        // BST.inorder(root);
        // System.out.println();

        if (BST.search(root, 1)) {
            System.out.println("found");
        } else {
            System.out.println("No found ");
        }

        // Uncomment the following lines if needed
        // BST.inorder(root);
        // System.out.println();

        // root = BST.delete(root, 1);

        // Uncomment the following lines if needed
        // BST.inorder(root);
        // System.out.println();

        // BST.printInRange(root, 5, 12);

        BST.printRoot2Leaf(root, new ArrayList<>());

        if (BST.isValidBST(root, null, null)) {
            System.out.println("valid");

        } else {
            System.out.println("not valid");
        }
    }
}
