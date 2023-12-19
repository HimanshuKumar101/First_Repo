import java.util.*;

/*
 * super keyword is used to refer immediate parent class object
 * 
 * - to access parent's properties
 * - access parent's function
 * - to access parent's constructor
 * 
 */

public class superkeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        super(); // call immediate parent's class constructor
        super.color = "brown";
        System.out.println("horse constructor is called");
    }
}
