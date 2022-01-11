import java.util.*;
public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] a={1,3,1,2,1,5};

        if(a.length==1) System.out.println(a[0]);
        if(a==null) System.out.println("enter some values");

        int sum=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]<a[i+1])
            {
                sum+=(a[i+1]-a[i]);

            }
        }
        System.out.println(sum);
    }
    
}
