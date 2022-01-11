import java.util.*;
public class PeakElements {
    static int peak_elements(int[] a,int n){
        int l=0;int r=n-1;
        while(l<=r)
        {
            int m=(l+r)/2;
            if((m==0 ||(a[m-1]<=a[m])) && (m==n-1)||(a[m+1]<=a[m]))
            {
                return a[m];
            }
            if(m>0 && (a[m-1]>=a[m]))
            {
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int value=peak_elements(a,n);
        System.out.println(value);
    }
    
}
