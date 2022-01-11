import java.util.*;
public class SubArrayWithSum {
    public static void main(String[] args) {
        int[] a={10,1,2,4,6,7};
        // int[] b={11,12,8,7,7,10,11};
        HashSet<Integer>h=new HashSet<Integer>();
        // for(int i=0;i<a.length;i++)
        // {
        //     h.add(a[i]);
        // }
        int sum=3,s=0;
        for(int i=0;i<a.length;i++)
        {    
            s+=a[i];
            if(s==sum) System.out.println("Yes");
            if(h.contains(s-sum))
            {
                System.out.println("Yes");
                break;
            }
            h.add(s);
        }

    }
    
}
