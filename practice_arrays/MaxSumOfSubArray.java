import java.util.*;
public class MaxSumOfSubArray {
    static int sumOfSubArray(int[] a){
        int maxEnd=a[0];
        int res=a[0];
        for(int i=1;i<a.length;i++){
            maxEnd=Math.max(maxEnd+a[i], a[i]);
            res=Math.max(maxEnd, res);
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
            int value=sumOfSubArray(a);
             System.out.println(value);
    }
    
}
