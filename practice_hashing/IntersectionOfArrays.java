import java.util.*;
public class IntersectionOfArrays {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int[] a={10,11,8,12,11,10,8};
        int[] b={11,12,8,7,7,10,11};
        HashSet<Integer>h=new HashSet<Integer>();
        for(int i=0;i<a.length;i++)
        {
            h.add(a[i]);
        }
        int c=0;
        for(int i=0;i<b.length;i++)
        {
            if(h.contains(b[i]))
            {
                c++;
                h.remove(b[i]);
            }
        }
        System.out.println(c);
        
    }
    
}
