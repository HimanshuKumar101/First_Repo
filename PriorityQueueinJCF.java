import java.util.*;

public class PriorityQueueinJCF {

    static class Student implements Comparable<Student> { // Overriding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        /*
         * // rank calculation using compareTo function s1 "abc" s2 " xyz" 15 1> 12 -
         * 15 = -ve = -3 obj1 < obj2 (s1 < s2) 2> 16 - 12 = +ve = +3 obj1(this) >
         * obj2(s1
         * > s2) 3> 15 - 15 = 0 | equal
         */

        @Override // class ke object ko compare karna
        public int compareTo(Student s2) { /// learn this syntax
            return this.rank - s2.rank;
        }

    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 4)); // O(log n)
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while (!pq.isEmpty()) {
            Student currentStudent = pq.poll(); // O(logn)
            System.out.println(currentStudent.name + " -->" + currentStudent.rank); // O(1)
        }
    }
}
