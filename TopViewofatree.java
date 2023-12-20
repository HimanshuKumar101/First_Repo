import java.util.*;

import org.w3c.dom.Node;

/*
HashMap in java(Brief) 
  map(key, value) 
  
  *key = unique value

  country         population
  (key value ) 
  china            123
  India            123
  us               56

  1> create
  Hashmap<string,integer> map = new Hashmap<>();
            (datatypes)


  2> add (put)
     map.put(key,value)


   3> get
      map.get(key) 

Time Complexity of Hash
add O(1)
remove O(1)
get O(1)

Horizontal Distance

             |                                    
             |
             |
-3-__-2__-1__|__1__2__3__4__5
             |
             |
             |

                (0)                         HD    node
                1                            0      1
              /  \(1)                       -1      2
              2  --3                         1      3
               \                             2      6
                4
                 \ (1)
                   5
                    \(2)                         1
                     6                         ---- X     
                                                 /    \
                                                X-1    X +1
 * top view of a tree
 *       (.) eyes
 * | |     |   |  |
 * | |     1   |  |
 * | |   /   \ |  |
   | 2        3   |
   |/ \      /  \ |
   4   5    4     6


   output 4,2,1,3,6
 
 
 
 
 */
public class TopViewofatree {

  static class Node {
    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class Info {
    Node node;
    int hd;

    public Info(Node node, int hd) {
      this.node = node;
      this.hd = hd;
    }
  }

  public static void topview(Node root) {
    // Level Order

    Queue<Info> q = new LinkedList<>();
    HashMap<Integer, Node> map = new HashMap<>();

    int min = 0, max = 0;
    q.add(new Info(root, 0));
    q.add(null);

    while (!q.isEmpty()) {
      Info curr = q.remove();
      if (curr == null) {
        if (q.isEmpty()) {
          break;
        } else {
          q.add(null);
        }
      }
      if (!map.containsKey(curr.hd)) { // first time my hd is occuring
        map.put(curr.hd, curr.node);

      }
      if (curr.node.left != null) {
        q.add(new Info(curr.node.left, curr.hd - 1));
        min = Math.min(min, curr.hd - 1);

      }
      if (curr.node.right != null) {
        q.add(new Info(curr.node.right, curr.hd + 1));
        max = Math.max(max, curr.hd + 1);
      }

    }

    for (int i = min; i <= max; i++) {
      System.out.print(map.get(i).data + " ");
    }
    System.out.println();

  }

  }

  public static void main(String[] args) {

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

  }
}