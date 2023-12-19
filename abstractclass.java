import java.util.*;

public class abstractclass {
    public static void main(String[] args) {

        /*
         * Horse h = new Horse();
         * h.eat();
         * h.walk();
         * System.out.println(h.color);
         * 
         * /*
         * Chicken c = new Chicken();
         * c.eat();
         * c.walk();
         * 
         * /*
         * Animal a = new Animal(); this object will created error because abstract
         * class canot make the object
         * a.eat();
         */

        Mustang myHorse = new Mustang();
        // Animal --> horse-->Mustang

    }
}

abstract class Animal { // cannot make object inside of it
    String color;

    Animal() {
        // color = " brown";
        System.out.println("animal constructor called"); // constructor chaining
    }

    void eat() {
        System.out.println("animal eat");

    }

    abstract void walk(); // abstract method not have implentation
}

class Horse extends Animal {

    Horse() {
        System.out.println("horse constructor are called");
    }

    void changecolor() {
        color = " darkbrown";
    }

    void walk() {
        System.out.println("walks on 4 leg");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("mustang constructor are called");
    }
}

class Chicken extends Animal {
    void changecolor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walk on 2 legs");
    }
}