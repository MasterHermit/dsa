// to rotate the array  the d times counter clock wise.
import java.util.*;
public class LeftRotateDTimes {
   static void rotateOneTime(int[] a,int d){
       int temp=a[0];
       for(int i=1;i<a.length;i++){
           a[i-1]=a[i];
           
       }
       a[a.length-1]=temp;
   }
   
    static void rotateDTimes(int[] a,int d){
        for(int i=0;i<d;i++)
        rotateOneTime(a,d);

        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int d=sc.nextInt();
        int[] arr=new int[6];
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();

        rotateDTimes(arr,d);
    }
    
}
