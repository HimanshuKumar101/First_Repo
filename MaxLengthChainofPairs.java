import java.util.*;

/* you are given n pairs of numbers. In every Pair, the first number is 
 * always smaller than the second number. A pair(c,d) can come after pair(a,b) if b < c.
 * 
 * find the longest chain which can be formed from a given set of pairs.
 * 
 * pairs=             / ans 3
 * (5,24)
 * (39,60)
 * (5,28)
 * (27,40)
 * (50,90)
 * 
 * 
 * a____b   c___d
 *     b < c
 * 
 * 
 *                               ._______3________________.        
 *                .____2____. 
 *     .___________.
 *    .__1________.       ._____________.
 * _____________________________________________________________
 * 0    10    20    30    40    50    60    70    80    90    100
 * 
 * 
 * approach 
 * 
 * 1> sort pairs(baised on 2nd number)
 * 
 * 2> 1st pair
 *   for(int i  =1; i<n; i++){
 *   if(pair start > last selected end) {
 * }}
 */

public class MaxLengthChainofPairs {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1]; // last selected pair end // chain end

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("max chain length is = " + chainLen);

    }
}