import java.util.*;

public class Friendspairingproblem {

    /*
     * given n friends, each one remain single or can be paried up with some other
     * friend. each friend can be paired only once. find out the total n
     * numbers of ways in which friends can remain single or can be paired up.
     */

    public static int friendspairing(int n) {

        if (n == 1 || n == 2) {
            return n;
        }
        // choice
        // single
        int fnm1 = friendspairing(n - 1);

        // pair
        int fnm2 = friendspairing(n - 2);
        int pairways = (n - 1) * fnm2;

        // totways
        int totways = fnm1 + pairways;

        return totways;

        // return friendspairing(n-1) + (n-1) * friendspairing(n-2);
    }

    // Binary strings problem
    // print all binary strings of size n without consecutive ones.

    public static void printBinString(int n, int lastplace, String str) {

        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        /*
         * if(lastplace == 0 ){
         * // sit 0 on chair n
         * printBinString(n-1,0 , str.append("0"));
         * printBinString(n-1, 1, str.append("1"));
         * 
         * }else{
         * printBinString(n-1, 0, str.append("0"));
         * }
         */

        printBinString(n - 1, 0, str + "0");

        if (lastplace == 0) {
            printBinString(-1, 1, str + "1");
        }

    }

    public static void main(String[] args) {
        // System.out.println(friendspairing(3));
        printBinString(3, 0, "");

    }
}