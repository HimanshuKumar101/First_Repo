import java.util.*;

public class Inheritance {

    // base class
    class Animal {
        String color;

        void eat() {
            System.out.println("eats");
        }

        void breathe() {
            System.out.println("breathes");
        }

    }

    class Mammals extends Animal {
        int legs;

        void walk() {
            System.out.println("walks");
        }

    }

    class Fish extends Animal {
        void Swim() {
            System.out.println("swim");
        }
    }

    class Bird extends Animal {
        void fly() {
            System.out.println("fly");
        }
    }

    class Dog extends Mammal {
        String breed;
    }

    // derived class // single level inheritance
    /*
     * class Fish extends Animal {
     * int fins;
     * 
     * void swim() {
     * System.out.println("swims in water");
     * }
     * }
     * 
     */
    public static void main(String[] args) {

        // Fish shark = new Fish();
        // shark.eat();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);

    }
}
