import java.util.*;
public class DistinctElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       HashSet<Integer>h=new HashSet<Integer>();
       for(int i=0;i<n;i++){
           h.add(a[i]);
       }
       System.out.println(h.size());

    }
    
}
