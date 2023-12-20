import java.util.*;

public class recursion {
    // print number from n to 1 in decreasing order
    public static void printdec(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        printdec(n - 1);
    }

    // print numbers in increasing order
    public static void printinc(int n) {
        if (n == 1) {
            System.out.println(n + " ");
            return;
        }
        printinc(n - 1);
        System.out.print(n + " ");
    }

    // find factorial of N
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fn = n * factorial(n - 1);
        return fn;
    }

    // print sum of first n natural numbers

    public static int calcsum(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = calcsum(n - 1);
        int sn = n + snm1;
        return sn;
    }

    // check if array is sorted or not
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;

        }
        return isSorted(arr, i + 1);

    }

    // first occurence

    public static int firstoccurence(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstoccurence(arr, key, i + 1);
    }

    // waf to find the last occurence of an element in an array

    public static  lastoccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isfound = lastoccurence(arr, key, i + 1);
        if (isfound != -1 && arr[i] == key) {
            return i;
        }

        // check with self

        if (arr[i] == key) {
            return i;
        }
    }

    public static void main(String[] args) {

        // int n = 5;
        // printdec(n);
        // printinc(n);
        // System.out.println(factorial(n));
        // System.out.println(calcsum(n));

        // int arr[] = { 1, 2, 3, 4, 5 };
        // System.out.println(isSorted(arr, 0));

        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        //
        // System.out.println(firstoccurence(arr, 5, 0));
        System.out.println(lastoccurence(arr, 5, 0));

    }
}