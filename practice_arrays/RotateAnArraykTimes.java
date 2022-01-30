import java.util.*;
public class RotateAnArraykTimes{
    public static void main(String[] args){
        int k=8;
        int[] arr={1,2,3,4,5,6,7};
        if(k>arr.length) k=k-arr.length;
        
      
        for(int i=0;i<k;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-k+i];
            arr[arr.length-k+i]=temp;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    } 
}