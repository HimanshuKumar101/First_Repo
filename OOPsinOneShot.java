import java.util.*;

public class OOPsinOneShot {

    public class Pen {
        String color;
        String type; // ballpoint; gel

        public void write() {
            System.out.println("writing something");
        }

        public void printColor() {
            System.out.println(this.color); // this will tell you ke kese object ne call kiya ha
        }
    }

    class Student {
        String name;
        int age;

        /*
         * public void printInfo() {
         * System.out.println(this.name);
         * System.out.println(this.age);
         * }
         * 
         * /*
         * Student() {
         * System.out.println("constructor is called"); //if we do not make any non
         * parametrised constructor than java make
         * //itself a constructor
         * }
         * 
         * 
         * // parameter constructor below
         * Student(String name, int age) {
         * this.name = name;
         * this.age = age;
         * /*
         * here this.age is age of object s1
         * and age is the age of student constructor in parameter
         * 
         * 
         * // Copy Constructor
         * Student(Student s2) {
         * this.name = s2.name;
         * this.age = s2.age;
         * }
         * 
         * Student() {
         * 
         * }
         */

        // Polymorisphm

        // below code is call function overloading

        // compile time polymorishphm

        // other should be something different
        // parametric should be different
        // return type should be different
        // no. of parametric should be different

        public void printInfo(String name) {
            System.out.println(name);

        }

        public void printInfo(int age) {
            System.out.println(age);
        }

        public void printInfor(String name, int age) {
            System.out.println(name + " " + age);
        }

    }

    class Shape {
        String color;

        public void area() {
            System.out.println("displays area");
        }

    }

    // single inheritance
    class Triangle extends Shape {

        public void area(int l, int h) {
            System.out.println(1 / 2 * l * h);
        }

    }

    // multiinterance

    class EquilateralTriangle extends Triangle {
        public void area(int l, int h) {
            System.out.println(1 / 2 * l * h);
        }
    }

    // hierarchial inheritance
    class Circle extends Shape {
        public void area(int r) {
            System.out.println(3.14 * 5);
            ;
        }
    }

    // package bank;

    class Account {
        public String name;
        protected String email;
        private String password;

        // getters and setters
        public String getPassword() {
            return this.password;

        }

        private void setPassword(String pass) {
            this.password = pass;
        }
    }

    public static void main(String[] args) {

        OOPsinOneShot oop = new OOPsinOneShot(); // Create an instance of the outer
        /*
         * class
         * Pen pen1 = oop.new Pen(); // Create an instance of the inner class using the
         * outer class instance
         * pen1.color = "blue";
         * pen1.type = "gel";
         * 
         * pen1.write(); // calling pen class
         * 
         * OOPsinOneShot oop2 = new OOPsinOneShot(); // Create another instance of the
         * outer class
         * Pen pen2 = oop2.new Pen(); // Create an instance of the inner class using the
         * new outer class instance
         * pen2.color = "black";
         * pen2.type = "ballpoint";
         * 
         * pen1.printColor();
         * pen2.printColor();
         * 
         */

        // Create an instance of the inner class using the outer class instance
        // OOPsinOneShot.Student s1 = oop.new Student(); // student() is constructor
        // that construct object and it is non
        // parametric constructor
        // constructor have same name of class, they did not have any return type
        // for one object one constructor can called only once. only when constructor is
        // created
        /*
         * *s1.name = "aman";
         * s1.age = 24;
         */
        // OOPsinOneShot.Student s1 = oop.new Student("name", 24);

        OOPsinOneShot.Student s1 = oop.new Student();
        s1.name = "aman";
        s1.age = 24;

        /*
         * Student s2 = new Student(s1);
         * s2.printInfo();
         */

        s1.printInfo(s1.name, s1.age);

        Account account1 = new Account();
        account1.name = "apna college";
        account1.email = " apnacollegea";
        account1.setPassword("adfa");
        System.out.println(account1.getpassword());

    }
}
