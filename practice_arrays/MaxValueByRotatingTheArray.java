import java.util.*;

public class MaxValueByRotatingTheArray {
    static int findMax(int[] arr) {
        int sum = 0, arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + (arr[i] * i);
            arrSum += arr[i];
        }

        int msum = sum;
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arrSum - arr.length * arr[arr.length - i];
            msum = Math.max(msum, sum);
        }

        return msum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 20, 2, 10 };
        int sum = findMax(arr);
        System.out.println(sum);
    }

}
