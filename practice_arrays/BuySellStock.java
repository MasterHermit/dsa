
import java.util.*;
public class BuySellStock {
    static int maxProfit(int[] a,int n){
        
        int profit=0;
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                profit+=(a[i]-a[i-1]);
            }

        }
        return profit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int value=maxProfit(a,n);
        System.out.println(value);
    }
    
}
