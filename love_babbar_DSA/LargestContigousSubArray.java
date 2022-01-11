import java.util.*;
public class LargestContigousSubArray {
    public static void main(String[] args) {
        int[] a={10,12,1,-12,-2,13,14,-20};

        int sum=a[0],fsum=a[0];
        for(int i=1;i<a.length;i++)
        {
           sum=Math.max(sum+a[i],a[i]);
           fsum=Math.max(fsum,sum);
        }
        System.out.println(fsum);
    }
    
}
