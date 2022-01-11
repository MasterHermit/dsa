
import java.lang.Math;
import java.util.*;


public class MaxDiff {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int d=sc.nextInt();
        int[] arr=new int[d];
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();

        int max=arr[1]-arr[0];
        int min=arr[0];
        for(int i=1;i<d;i++){
           max= Math.max(max,arr[i]-min);
           min=Math.min(min,arr[i]);
        }
        System.out.println(max);
     
    }
    
}
