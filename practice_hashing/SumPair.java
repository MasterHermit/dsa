import java.util.*;
public class SumPair {
    public static void main(String[] args) {
        int[] a={11,6,5};
        // int[] b={11,12,8,7,7,10,11};
        HashSet<Integer>h=new HashSet<Integer>();
        // for(int i=0;i<a.length;i++)
        // {
        //     h.add(a[i]);
        // }
        int sum=10;
        for(int i=0;i<a.length;i++)
        {
            int m=sum-a[i];
            if(h.contains(m))
            {
                System.out.println("Yes");
                break;
            }
            h.add(a[i]);
        }
        
    }
    
}
