import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class FirstIndexOfGivenNum {
    static int first_index(int[] a, int n, int x) {
        int l = 0;
        int r = n - 1;
        int res = -1;
        while (l <=r ) {
            int m = (l + r) / 2;
            if(x==a[m])
            {
                res=m;
                r=m-1;

            }
            else if(x<a[m])
            {
                r=m-1;

            }
           else{
               l=m+1;
           }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int value = first_index(a, n, x);
        System.out.println(value);
    }

}