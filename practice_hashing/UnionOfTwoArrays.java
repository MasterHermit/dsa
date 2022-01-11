import java.util.*;
public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] a={10,11,8,12,11,10,8};
        int[] b={11,12,8,7,7,10,11};
        HashSet<Integer>h=new HashSet<Integer>();
        for(int i=0;i<a.length;i++)
        {
            h.add(a[i]);
        }
        
        for(int i=0;i<b.length;i++)
        {
            h.add(b[i]);
        }
        System.out.println(h.size());
        
    }
    
}
