
//
import java.util.*;

public class LeftRotateDTimes2 {
    static void leftRotate(int[] a, int d) {
        reverse(a, 0, d - 1); //step1
        reverse(a, d, a.length - 1); //step2
        reverse(a, 0, a.length - 1); //step3
        //for right rotate d times take step 3 to frst

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    static void reverse(int[] a, int low, int high) {
        while (low < high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        leftRotate(arr, d);
    }

}
