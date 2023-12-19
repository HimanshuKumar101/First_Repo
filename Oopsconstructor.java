import java.util.*;

public class Oopsconstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("himanshu");
        Student s3 = new Student(123);
    }
}

class Student {
    String name;
    int roll;

    Student() { // non-parameterized constructor
        System.out.println("This constructor is called");
    }

    Student(String name) {
        this.name = name;
        System.out.println("Parameterized constructor with name: " + name);
    }

    Student(int roll) {
        this.roll = roll;
        System.out.println("Parameterized constructor with roll: " + roll);
    }
}
