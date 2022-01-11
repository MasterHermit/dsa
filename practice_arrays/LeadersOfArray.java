 
 import java.util.*;
 public class LeadersOfArray {
     public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int d=sc.nextInt();
        int[] arr=new int[d];
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
     
     int cl=arr[d-1];
     System.out.print(cl);
     for(int i=d-2;i>=0;i--){
         if(cl<arr[i]){
             cl=arr[i];
             System.out.print(cl);
         }
     }
    }
}
