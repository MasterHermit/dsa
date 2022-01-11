
import java.util.*;
public class EquilibriumIndexOfArray {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
        
        int n =sc.nextInt();
        
       
        int[] a=new int[n];
     
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //finding total sum 
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];

        }
        int leftsum=0;
        
        for(int i=0;i<n;i++){
            sum-=a[i];
            if(sum==leftsum)
            System.out.println(i);
            leftsum+=a[i];
        }


    }
    
}
