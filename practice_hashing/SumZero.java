import java.util.*;

public class SumZero {
    public static void main(String[] args) {

        int[] a = { 10, 11, 8,-2,-6 };
        // int[] b={11,12,8,7,7,10,11};
        HashSet<Integer> h = new HashSet<Integer>();
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            if(h.contains(sum)) 
            {
                System.out.println("yes");
                break;
            }
            if(sum ==0) System.out.println("yes");
            h.add(sum);
        }

    }

}
