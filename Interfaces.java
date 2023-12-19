import java.util.*;

public class Interfaces {
    public static void main(String[] args) {

        Queen q = new Queen();
        q.moves();

    }

}

interface Chessplyaer {
    void moves();
}

class Queen implements Chessplyaer {
    public void moves() {
        System.out.println("up,down,leftj,right ,diagonal");
    }
}

class Rook implements Chessplyaer {
    public void moves() {
        System.out.println("up,down,leftj,right ");
    }
}

class King implements Chessplyaer {
    public void moves() {
        System.out.println("up,down,leftj,right ,diagonal( by 1 step)");
    }
}

// multiple inheritance
// multiple interitance happen only in interface with help of implementation
interface Animal {
    int eyes = 2;

    void walk();
}

interface Herbivorce {

}

class Horse implements Animal {
    public void walk() { // public is written because if public is not written then it will be by default
        System.out.println("walks on 4 legs");
    }
}