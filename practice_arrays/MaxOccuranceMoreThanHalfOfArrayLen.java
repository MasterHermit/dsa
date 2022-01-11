import java.util.*;

public class MaxOccuranceMoreThanHalfOfArrayLen {

    static int Max_Ocurance(int[] a) {
        int n = a.length;
        int count = 1;
        int temp = 0;
        for (int i = 1; i < n; i++) {
            if (a[temp] == a[i])
                count++;
            else
                count--;
            if (count == 0) {
                temp = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (a[temp] == a[i])
                count++;
          

        }
        if (count <= n / 2)
        return -1;
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int value = Max_Ocurance(a);
        System.out.println(value);
    }

}
