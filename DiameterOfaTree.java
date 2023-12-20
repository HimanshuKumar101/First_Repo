import java.util.*;

/*  recursion is used in tree to finding these things

approach 1 : diameter passes through root
                dia = lh + rh + 1
    approach 2 : diameter does not passes through root nodes
                 dia 
 diameter of a tree =  no. of nodes in the longest path between 2 leaves 

 case 1:  diameter passes through root
           dia = lh + rh + 1

case 2: left side diameter

case 3 right side diameter

diamter will be maximum of any between these 3


approach 1 
              1
             /  \
             2    3
             / \   \ 
             4  5   6



 * 
 * 
 * 
*/
public class DiameterOfaTree {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    /*
     * public static int diameter(Node root) { // O(n^2)
     * if (root == null) {
     * return 0;
     * }
     * 
     * int leftDiam = diameter(root.left);
     * int leftHt = height(root.left);
     * int rightDiam = diameter(root.right);
     * int rightHt = height(root.right);
     * 
     * int selfDiam = leftHt + rightHt + 1;
     * 
     * return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
     * 
     * }
     */

    public static int diameter2(Node root) { // O(n^2)
        if (root == null) {
            return 0;
        }

        int leftDiam = diameter2(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter2(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));

    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.hit = ht;
        }
    }

    public static Info diameter(Node root) { // O(n)

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam, leftInfo.ht + rightInfo.ht + 1));
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);

    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(height(root));

        System.out.println(diameter(root).diam);

    }
}