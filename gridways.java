import java.util.*;

/* find number of ways to reach from (0,0) to (N-1,M-1) int a NxM Grid,
 * Allowed moves --- right or down.
 *
*/

public class gridways {
    public static int gridwayss(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) { // condn for last cell
            return 1;
        } else if (i == n || j == n) { // boundary cross condn
            return 0;
        }

        int w1 = gridwayss(i + 1, j, n, m);
        int w2 = gridwayss(i, j + 1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridwayss(0, 0, n, m));

    }
}