import java.util.*;
public class NonReapeatingElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        LinkedHashMap<Integer,Integer>h=new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(h.containsKey(a[i]))
            {
                h.put(a[i], h.get(a[i])+1);
            }
            else{
                h.put(a[i],1);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            
            if(h.get(a[i])==1)
            {
                System.out.println(a[i]);
                count++;
            }
        }
        System.out.println(count);
    }
    
}
