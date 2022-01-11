import java.util.*;

public class RainWater {

    static int waterStored(int[] a) {
        int n = a.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        int res = 0;
        lmax[0] = a[0];
        rmax[n - 1] = a[n - 1];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i - 1], a[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i + 1], a[i]);
        }
        for (int i = 1; i < n - 1; i++) {
            res += (Math.min(rmax[i], lmax[i]) - a[i]);
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int value = waterStored(a);
        System.out.println(value);
    }

}
