import java.util.*;

public class ValidStackSequences {
    static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        int pointer = 0;
        for (int value : pushed) {
            s.push(value);
            while (!s.isEmpty() && s.peek() == popped[pointer]) {
                s.pop();
                pointer++;
            }
        }
        return s.isEmpty();

    }

    public static void main(String[] args) {
        int[] pushed = { 1, 2, 3, 4, 5 };
        int[] popped = { 4, 5, 3, 2, 1 };
        System.out.println(validateStackSequences(pushed, popped));

    }

}
