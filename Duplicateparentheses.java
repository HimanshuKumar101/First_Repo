import java.util.*;
/* given a balanced expression, find if it contains duplicate parentheses or not. a set of parentheses
 * are duplicate if the same subexpression is surrounded by
 * multiple parentheses.
 * 
 * return true if it contains duplicates else return false.
 * 
 * example (((a+ (b))) + (c +d) )  true
 *         ((a+b) + (c + d)) false
 */

public class Duplicateparentheses {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate
                } else {
                    s.pop(); // opening pair
                }
            } else {
                // opening
                s.push(ch);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))"; // true
        String str2 = "(a-b)"; // false
        System.out.println(isDuplicate(str));

    }
}