import java.util.*;
public class CylicalyRotateAnArrayByOne {
    public static void main(String[] args) {
        int[] a={10,11,12,13,14};
        int n=a.length;

        int temp=a[0];
        for(int i=0;i<n-1;i++)
        {
            a[i]=a[i+1];
        }
        a[n-1]=temp;

        for(int i=0;i<n;i++) System.out.print(a[i]);
    }
    
}
