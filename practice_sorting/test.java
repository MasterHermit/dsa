import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] a=new Integer[n];
        Integer[] b={10,20,30,30,40,40,40};
       
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        List<Integer> al = Arrays.asList(a);
        List<Integer>bl=Arrays.asList(b);
        // al.removeAll(bl);
        
        al.addAll(bl);
        al.forEach(System.out::println);

       

    }
    
}
