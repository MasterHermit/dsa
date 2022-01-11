import java.util.*;
public class FindCommonElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b={10,20,30,30,40,40,40};
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        LinkedHashSet<Integer>h=new LinkedHashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            h.add(a[i]);
        }
        for(int i=0;i<b.length;i++)
        {
            
        }

        for(int i=0;i<b.length;i++)
        {
            if(h.contains(b[i]))
            {
                System.out.println(b[i]);
            }
        }

    }
    
}
