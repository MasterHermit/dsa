import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int[] a=new int[n];
       
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        System.out.println(a[i]);
       
        int csum=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<n-2;i++)
        {
            int p1=i+1;
            int p2=n-1;
           
            while(p1<p2)
            {
                int sum=a[i]+a[p1]+a[p2];
                if(sum==t)
                {
                    System.out.println(t);
                }
               if(Math.abs(t-sum)<csum)
               {
                   csum=t-sum;
                   res=sum;
               }

                if(sum>t)p2--;
                else p1++;

            }
        }
        System.out.println(res);
       

       
       
    }
    
}
