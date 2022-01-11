//sort o,1,2 in an array in ascending order without any sort algorithm
import java.util.*;
public class DutchnationalFlag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        int l=0,m=0,h=n-1;
        while(m<=h)
        {
            if(a[m]==0)
            {
                int temp=a[l];
                a[l]=a[m];
                a[m]=temp;
                l++;
                m++;
            }
            else if(a[m]==2)
            {
                int temp=a[m];
                a[m]=a[h];
                a[h]=temp;
                h--;
            }
            else {
                m++;
            }
        }


      
        for (int i=0;i<n;i++) {
            System.out.print(a[i]);
            
        }

        
        
    }
    
}
