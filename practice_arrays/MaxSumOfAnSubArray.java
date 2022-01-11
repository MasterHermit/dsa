import java.util.*;


public class MaxSumOfAnSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ;
        int n =sc.nextInt();
        
        int k=sc.nextInt();
        int[] a=new int[n];
     
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        int sum=0;
       
            for(int i=0;i<k;i++){
                sum+=a[i];
            }
            System.out.println(sum);
            
            int end=(n+1)-k;


            for(int i=1;i<end;i++){
                int b=a[i]-a[i-1]+a[i+k-1];
                sum=Math.max(sum,b );

            }
            System.out.println(sum);






          

    
        
    }
    
}
