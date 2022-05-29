import java.util.*;

public class WatchingMovie {
  static void solve(int[] h, int k, int n) {
    int[] max = new int[n];
    int m = h[n - 1];
    max[n - 1] = h[n - 1];
    int c = k-1;
    for (int i = n - 2; i >= 0; i--) {
      if (c > 0) {
        m = Math.max(m, h[i + 1]);
        max[i] = m;
        c--;
      } else {
        int t = k;
        int min = Integer.MIN_VALUE;
        while (t > 0) {
          min = Math.max(min, h[i + t]);
          t--;
        }
        max[i] = min;
      }

    }
    for (int i : max) {
      System.out.print(i + " ");
    }
    System.out.println();
    int flag = 1;
    for (int i = n - 2; i >= 0; i--) {
      if (h[i] > max[i])
        flag++;

    }
    System.out.println(flag);

  }

  public static void main(String[] args) {
    int[] h = { 10,10,4 };
    int k = 2;
    solve(h, k, h.length);
  }

}
