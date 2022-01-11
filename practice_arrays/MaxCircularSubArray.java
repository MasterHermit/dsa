import  java.util.*;

public class MaxCircularSubArray {
    static  int maxSubArray(int[] a){
        int l=a.length;
        int max=a[0];
        int res=a[0];
        for(int i=1;i<l;i++){
            max=Math.max(max+a[i],a[i]);
            res=Math.max(max,res);
        }
return res;
    }
    static int  maxSubArrayOverAll(int[] a){
        int l=a.length;
        int value=maxSubArray(a);
        if(value<0) return value;
        int sum=0;
        for(int i=0;i<l;i++){
            sum+=a[i];
            a[i]=-a[i];
        }
        int maxValue=sum+maxSubArray(a);
        return Math.max(value,maxValue);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int value=maxSubArrayOverAll(a);
        System.out.println(value);
         
    }
    
}
