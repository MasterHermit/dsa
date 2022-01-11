import java.util.*;
public class MaxWaterContainer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {     int width=n-i-1;
            for(int j=i+1;j<n;j++)
            {
                max=Math.max(max,Math.min(a[i],a[j])*width);
                width--;
                System.out.print(max+" ");

            }
        }
        System.out.println(max);
    }
    
}
