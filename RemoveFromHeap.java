import java.util.ArrayList;

public class RemoveFromHeap {

    /*
     * max heap max priority
     * 
     * min heap min priority
     * 
     * visualize -- > Heap(BT) implement --> Array
     * 
     * Binary Tree: at most 2 Children
     * 
     * Complete Binary Tree: CBT is a BT in which all the levels are completely
     * filled except possibly the last one, which is filled from the left to right
     * 
     * Heap Order Property:
     * 
     * Children >= Parent(minHeap)
     * children <= Parent(maxHeapk)
     * 
     * p -c 1> i 2> left = 2i + 1 3> right = 2i + 2
     * 
     * insert in heap 1> add at last index 2> fix heap: par = ( x - 2 )/2 = 5-1/2 =
     * 2 while(child val < par val) swap(child,par)
     */

    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data) {
        // add at last idx
        arr.add(data);

        int x = arr.size() - 1; // x is child index
        int par = (x - 1) / 2; // par index

        while (x > 0 && arr.get(x) < arr.get(par)) { // O(logn) - added x > 0 condition
            // swap
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);

            x = par;
            par = (x - 1) / 2;
        }
    }

    // get Min In heap it means root element
    public int peek() {
        return arr.get(0);
    }

    // remove from heap
    // get min element from heap
    // 1> 1st & last node swap
    // remove last idx
    // arr.remove(arr.size()-1)
    // fix my heap --> heapify

    /*
     * heapify root = i
     * leftchild = 2i + 1
     * rightchild = 2i + 2
     * // Also, the parent of any element at index i is given by the lower bound of
     * (i-1)/2.
     * 
     * min = (i,2i+1,2i+2) min betwee root leftchild and rightchild
     * those how are min get swap
     * run for whole tree
     * 
     * 
     * 
     */

    public int remove() {
        int data = arr.get(0);

        // step1 -- swap first & last
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size() - 1));
        arr.set(arr.size() - 1, temp);

        // step 2 -- delete last
        arr.remove(arr.size() - 1);

        // step3 heapify
        heapify(0);
        return data;

    }

    private void heapify(int i) { // fix the heap
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int minIdx = i;

        if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
            minIdx = left;
        }
        if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
            minIdx = right;
        }
        if (minIdx != i) {
            // swap
            int temp = arr.get(i);
            arr.set(i, arr.get(minIdx));
            arr.set(minIdx, temp);

            heapify(minIdx); // here again heapify check after doing changes
        }
    }

    public boolean isEmpty() {
        return arr.size() == 0;
    }

    public static void main(String[] args) {
        RemoveFromHeap h = new RemoveFromHeap(); // Corrected class name
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
