import java.util.*;

public class binarysearch {

    public int binarysort(int array[], int x, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == x)
                return mid;
            if (array[mid] > x)
                return binarysort(array, x, low, mid - 1);

            return binarysort(array, x, mid + 1, high);
        }
        return -1;

    }

    public static void main(String[] args) {
        int array[] = { 3, 4, 5, 6, 7, 8, 9 };
        int n = sizeof(array) / sizeof(array[0]);
        int x = 4;
        int result = binarysort(array, x, 0, n - 1);
        if (result == -1)
            System.out.println("not founnd");
        else
            System.out.println("element is found at index %d", result);

    }
}
