import java.util.*;
public class SubArrayWithSumK{
    static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>set=new HashMap<>();
         int sum=0;
         int count=0;
         for(int i=0;i<nums.length;i++)
         {
             sum+=nums[i];
             if(sum==k){
                 count++;
                
             } 
             if(set.containsKey(sum-k))
             {
                 count+=set.get(sum-k);
             }
             set.put(sum,set.getOrDefault(sum,0)+1);
         }
         return count;
         
     }
    public static void main(String[] args) {
        int k=3;
        int[] nums={1,2,3,4};
        System.out.println(subarraySum(nums,k));
        
    }
}