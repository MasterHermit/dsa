// You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

// Return true if you can reach the last index, or false otherwise.
import java.util.*;

public class jump {
    public static boolean canJump(int[] nums) {
        int s=0;
        if(nums.length<=1) return true;
        for(int i=0;i<nums.length;i++)
        {
            s--;
            s=Math.max(s,nums[i]);
            if(s==0) return i==nums.length-1;
        }
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc=new  Scanner (System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++) nums[i]=sc.nextInt();

        System.out.println(canJump(nums));


    }

}
