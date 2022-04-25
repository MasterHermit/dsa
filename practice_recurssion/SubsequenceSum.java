import java.util.*;
public class SubsequenceSum {
    static void subSum(int index,int[] arr,int n,int sum,List<Integer>list,int s){
    
        if(index==n){
            if(s==sum){
                for(int k:list)System.out.println(k);
             }
             return;
        }
        
        list.add(arr[index]);
        s+=arr[index];
        subSum(index+1, arr, n, sum, list, s);

       
       
        s-=arr[index];
        list.remove(arr[index]);
        subSum(index+1, arr, n, sum, list,s);

    }
    public static void main(String[] args) {
        int[] arr={1,2,1,1};
        int n=arr.length-1;
        int sum=4;
        List<Integer>list=new ArrayList<Integer>();
        subSum(0,arr,n,sum,list,0);
        
    }
    
}
