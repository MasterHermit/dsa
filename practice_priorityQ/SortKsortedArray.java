import java.util.*;

public class SortKsortedArray {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 18, 19 };
        int k = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i <= k; i++)
            pq.add(arr[i]);

        int index = 0;
        for (int i = k + 1; i < arr.length; i++) {
            arr[index++] = pq.poll();
            pq.add(arr[i]);

        }
        while (!pq.isEmpty()) {
            arr[index++] = pq.poll();
        }

        for (int i : arr)
            System.out.println(i);

    }

}
