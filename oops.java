import java.util.*;

public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.getcolor());

        p1.settip(5);
        System.out.println(p1.gettip());

        p1.setcolor("red"); // Use the method to set the color
        System.out.println(p1.getcolor());

        BankAccount myacc = new BankAccount();
        myacc.username = "himanshu";
        // myacc.Password = "adfasfd";
        myacc.setpassword("asdfasf"); // Use the method to set the password
    }
}

class BankAccount {
    public String username;
    private String password; // Corrected the variable name

    public void setpassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    String getcolor() {
        return this.color;
    }

    int gettip() {
        return this.tip;
    }

    void setcolor(String newColor) {
        this.color = newColor;
    }

    void settip(int newTip) {
        this.tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcpercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3.0f; // Corrected to use float division
    }
}
