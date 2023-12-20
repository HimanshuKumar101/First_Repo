import java.util.*;
import java.util.collections;

public class Arraylist {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        /*
         * ArrayList<Integer> list = new ArrayList<>();
         * 
         * // add
         * list.add(1); // O(1)
         * list.add(2);
         * list.add(3);
         * list.add(4);
         * list.add(5);
         * 
         * list.add(1, 9);
         */
        // System.out.println(list);

        // get operation -- O(1)
        // int element = list.get(2);
        // System.out.println(list.get(2));

        // list.get(2);

        // remove element O(n)
        // list.remove(2);
        // System.out.println(list);

        // set element at Index O(n)

        // list.set(2, 10);
        // System.out.println(list);

        // contains element O(n)
        // true false

        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        // size of array

        // System.out.println(list.size());

        // print the arraylist
        /*
         * for (int i = 0; i < list.size(); i++) {
         * System.out.print(list.get(i) + " ");
         * }
         * System.out.println();
         * 
         * // reverse the array list
         * for (int i = list.size() - 1; i >= 0; i--) {
         * System.out.print(list.get(i) + " ");
         * }
         * System.out.println();
         * 
         * // find the maximum in an arraylist
         * 
         * // int max = Integer.MIN_VALUE;
         * // for (int i = 0; i < list.size(); i++) {
         * // if (max < list.get(i)) {
         * // max = list.get(i);
         * // }
         * 
         * // max = Math.max(max, list.get(i));
         * 
         * // }
         * // System.out.println("max element is = " + max);
         * 
         * // swap of two numbers
         * 
         * int idx1 = 1;
         * int idx2 = 3;
         * 
         * System.out.println(list);
         * 
         * swap(list, idx1, idx2);
         * System.out.println(list);
         * 
         * Collections.sort(list);
         * System.out.println(list);
         * 
         * // descending
         * 
         * Collections.sort(list, Collections.reverseOrder());
         * // comparator --- function logic
         * System.out.println(list);
         * 
         */

        // mutli dimensional arraylist

        /*
         * ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
         * ArrayList<Integer> list = new ArrayList<>();
         * list.add(1);
         * list.add(2);
         * mainList.add(list);
         * 
         * ArrayList<Integer> list2 = new ArrayList<>();
         * list2.add(3);
         * list2.add(4);
         * mainList.add(list2);
         * 
         * for (int i = 0; i < mainList.size(); i++) {
         * ArrayList<Integer> currList = mainList.get(i);
         * for (int j = 0; j < currList.size(); j++) {
         * System.out.print(currList.get(j) + " ");
         * }
         * System.out.println();
         * }
         * 
         * System.out.println(mainList);
         */

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1); // 1 2 3 4 5
            list2.add(i * 2); // 2 4 6 8 10
            list3.add(i * 3); // 3 6 9 12 15
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        // nested loops
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

    }
}