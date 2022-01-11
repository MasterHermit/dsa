import java.util.*;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

    //the values of left and right range    
        int l = sc.nextInt();
        int r=sc.nextInt();
        int[] a = new int[n];
    
        //array input
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //prefix array to store sum values.
       int pl=r-l+1;
        int[] ps=new int[pl];

        ps[0]=a[l];
        for(int i=1;i<pl;i++){
            ps[i]=ps[i-1]+a[++l];
            
        }
        
        //displaying prefix array
        for(int i=0;i<pl;i++)
        System.out.println(ps[i]);

        //for sum value in end position
        System.out.println(ps[pl-1]);
    }

}
