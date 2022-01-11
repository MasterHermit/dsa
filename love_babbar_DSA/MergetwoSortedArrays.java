import java.util.*;
public class MergetwoSortedArrays {
    public static void main(String[] args) {
        int[] a={10,11,12,13,14};
        int[] b={13,13,13,13,13};
        int[] c=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]>=b[j])
            {
                c[k++]=b[j++];
            }
            else{
                c[k++]=a[i++];
            }
        }
        while(i<a.length)
        {
            c[k++]=a[i++];
        }
        while(j<b.length)
        {
            c[k++]=b[j++];
        }

        for(int z=0;z<c.length;z++) System.out.print(c[z]+" ");
    }
    
}
