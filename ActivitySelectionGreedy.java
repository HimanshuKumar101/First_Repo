import java.util.*;

/* you are given n activities with their start and end times.
select the maximum number of activities that can be performed by a single, assuming that 
a person can only work on a single activity at a time.
activities are sorted according to end time.
         A0 A1 A2   
         |   |  |
start = [10,12,20]
                            ans = 2 zeroth and second
end = [20,25,30]
 *    
 * 
 *      
 *        ._____.
 *          A2                    //nonoverlap
       ._____.                    // disjoint 
         A1   
    .______.
     A0
 ____________________
 0  10    20   30
 */

public class ActivitySelectionGreedy { // O(n)
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // sorting
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];

        }

        // lambda function -> shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(activities[0][0]);

        int lastEnd = end[activities[0][2]];

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                // activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }

        }

        System.out.println("max activity = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();

    }

}
