import java.util.*;

public class MaxConsecutiveOnes {
    static int consOne(boolean[] a) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == true) {
                count++;
                sum =Math.max(sum,count);

            } else {
                count = 0;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] a = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextBoolean();
        }
        int value = consOne(a);
        System.out.println(value);
    }

}
