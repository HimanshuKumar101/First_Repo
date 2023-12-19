import java.util.*;

public class recursionquestion {

    // print x to the power n

    public static int power(int x, int n) {

        if (n == 0) {
            return 1;
        }
        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;
        return xn;

        // * return x * power(x,n-1);

    }

    // print x to the power n in optimised way

    public static int optimizedpower(int a, int n) { // O(logn)

        if (n == 0) {
            return 1;
        }
        int halfpowersq = optimizedpower(a, n / 2) * optimizedpower(a, n / 2);
        // n is odd
        if (n % 2 != 0) {
            halfpowersq = a * halfpowersq;
        }
        return halfpowersq;

    }

    // tiling problem

    /*
     * given a 2*n floor and tiles of size 2*1 count the number
     * of ways to tile the given board using the 2 *1 tiles.
     * (a tile can eithe be placed horizontally or vertically)
     * 
     */

    public static int tilingproblem(int n) { // 2*n ( floor size)

        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // vertical choice
        int fnm1 = tilingproblem(n - 1);

        // horziontal choice
        int fnm2 = tilingproblem(n - 2);
        int totways = fnm1 + fnm2;

        return totways;

    }

    public static void removedup(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length) {
            System.out.println(newStr);
            return;
        }

        // remove duplicates in a string

        // kaam
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            // duplicate
            removedup(str, idx + 1, newStr, map);
        } else {
            map[currchar - 'a'] = true;
            removedup(str, idx, newStr.append(currchar), map);
        }
    }

    // friends pairing problem
    /*
     * given n friends, each one remain single or can be paried up with some other
     * friend. each friend can be paired only once. find out the total n
     * numbers of ways in which friends can remain single or can be paired up.
     */

    public static void main(String[] args) {
        // System.out.println(power(5, 02));

        int a = 2;
        // int n = 5;
        // System.out.println(optimizedpower(a, n));

        // System.out.println(tilingproblem(3));
        String str = "appnnacollege";
        // removedup(str, a, new StringBuilder(""), new boolean[26]);

    }
}