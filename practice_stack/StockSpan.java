
// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

public class StockSpan {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];

            int i = 0;
            for (i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int[] s = new Solution().calculateSpan(a, n);

            for (i = 0; i < n; i++) {
                System.out.print(s[i] + " ");
            }

            System.out.println();
        }
    }

}// } Driver Code Ends

class Solution {
    // Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n) {
        Stack<Integer> s = new Stack<>();
        int[] a = new int[n];
        a[0] = 1;
        s.push(0);
        for (int i = 1; i < n; i++) {
            while (s.isEmpty() == false && price[i] >= price[s.peek()])
                s.pop();

            a[i] = s.isEmpty() ? (i + 1) : (i - s.peek());

            s.push(i);

        }
        return a;
    }

}
