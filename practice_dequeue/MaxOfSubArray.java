import java.util.*;

public class MaxOfSubArray {
    public static void main(String[] args) {
        Deque<Integer> dque = new LinkedList<Integer>();
        int[] a = { 10, 7, 11, 2, 1, 33, 12, 34 };
        int k = 3;
        for (int i = 0; i < k; i++) {
            while (!dque.isEmpty() && a[i] >= a[dque.peekLast()]) {
                dque.removeLast();
            }
            dque.addLast(i);
        }
        for (int i = k; i < a.length; i++) {
            System.out.println(a[dque.peek()]);
            while (!dque.isEmpty() && dque.peek() <= i - k) {
                dque.removeFirst();

            }

            while (!dque.isEmpty() && a[i] >= a[dque.peekLast()]) {
                dque.removeLast();
            }
            dque.addLast(i);
        }
    }

}
