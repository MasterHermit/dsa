import java.util.*;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a={10,11,23,24};
        int[] b={1,24,34,45};
        int m=a.length;
        int n=b.length;
        int[] c=new int[m+n];
        int i=0;int j=0;int k=0;
         
        while (i<m && j<n) {
            if(a[i]<b[j])
            c[k++]=a[i++];
            else 
            c[k++]=b[j++];
            
        }
        while(i<m){
            c[k++]=a[i++];
        }
        while(j<n){
            c[k++]=b[j++];
        }
        for(int l=0;l<(m+n);l++)
        System.out.print(c[l]+" ");
    }
    
}
