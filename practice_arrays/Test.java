import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();

        int sum=0;

        for(int i=0;i<k;i++)
        {
            sum+=a[i];

        }
        int lsum=sum;

        for(int i=1;i<=n-k;i++)
        {
            sum=sum-a[i-1]+a[i+(k-1)];
            lsum=Math.max(lsum,sum);

        }
        System.out.println(lsum);
       
    }
    
}
