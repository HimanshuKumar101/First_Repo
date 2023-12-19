import java.util.*;

/* Interleave 2 halves of a queue (even length) 
 
 * 12345 678910            
 
 * 16273849510
 * size n = 10
 * size/2 = 5
 * 1st half
 *   |
 * queue2(first )
*/
public class Interleave2halvesofaqueue {
    public static void interLeave(Queue<Integer> q) {

        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());

        }

    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();

    }
}