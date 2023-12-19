import java.util.Arrays;

public class dsapractical {
    private static final int MAX_SIZE = 100;
    private int[] stack;
    private int top;

    public dsapractical() {
        stack = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int value) {
        if (top < MAX_SIZE - 1) {
            stack[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public int pop() {
        if (top >= 0) {
            int value = stack[top--];
            System.out.println("Popped: " + value);
            return value;
        } else {
            System.out.println("Stack is empty.");
            return -1; // Assuming -1 represents an empty stack or an error condition
        }
    }

    public void display() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public void sort() {
        Arrays.sort(stack, 0, top + 1);
        System.out.println("Stack sorted.");
    }

    public static void main(String[] args) {
        dsapractical stack = new dsapractical();

        stack.push(5);
        stack.push(3);
        stack.push(8);
        stack.push(1);

        System.out.println("Original Stack:");
        stack.display();

        stack.sort();

        System.out.println("Sorted Stack:");
        stack.display();
    }
}