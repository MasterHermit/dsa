
import java.util.*;
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=n/2;
        
        for(int i=0;i<m;i++){
           int temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;

        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
    
}
