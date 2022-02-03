import java.util.*;
public class FourSum{
    private static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer>hm=new HashMap<>();
        for(int num1:nums1){
            for(int num2:nums2)
                hm.put(num1+num2,hm.getOrDefault(num1+num2,0)+1);
        }
        int count=0;
        for(int num3:nums3)
            for(int num4:nums4)
                count+=hm.getOrDefault(-(num3+num4),0);
        
        return count;
                
    }
    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2={-2,-1};
        int[] nums3={-1,2};
        int[] nums4={0,2};
        System.out.println(fourSumCount(nums1,nums2,nums3,nums4));

        
    }
}