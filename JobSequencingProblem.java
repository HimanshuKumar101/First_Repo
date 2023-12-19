import java.util.*;

/* given an array of jobs where every job has a decline
 * and profit if the job is finished before the deadline. it is also given that every job
 * takes a single unit of time, so the minimum possible deadline for any job is 1.
 * Maximize the total profit if only one job can be scheduled at a time.
 * 
 * Job A = 4,20
 * JOb B = 1,10
 * Job c = 1,40      ans = C, A
 * Job D = 1,30
 * 
 * case 1> A time  = 1 profit 20
 * case 2) BA time 2, profit 10+20 = 30
 * case 3) CA time = 2, p = 40 + 20 = 60
 * case 4) BA time = 2, P = 30 + 20 = 50
 */

public class JobSequencingProblem {
    public static class Job {
        int id; // Added id
        int deadline;
        int profit;

        // Added constructor with parameters
        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));

        }
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit); // descending order of profit.
        // custom comparater above line

        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        // print seq
        System.out.println("max jobs = " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();

    }
}