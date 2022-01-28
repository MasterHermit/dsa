import java.util.*;

public class StackImplementation {
    public static List<Integer> s = new ArrayList<>();

    public static void push(int data) {
        s.add(data);

    }

    public static void pop() {
        if (s.isEmpty())
            return;
        s.remove(s.size() - 1);
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        pop();

        System.out.println(s);

    }
}