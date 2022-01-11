import java.util.*;

public class FindTwoNumWithSumEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            if(l==r) System.out.println("No");
            if (x < a[l] + a[r]) {
                r--;

            } else if (x > a[l] + a[r]) {
                l++;

            } else {
                System.out.println("Yes");

                break;
            }

        }

    }

}
