public class RemoveDuplicatesFromASortedArrayII {
    public static void main(String[] args) {
        int [] nums={1,1,1,2,2,2,3,3};
        int prev=1,count=1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==nums[i-1])count++;
            else count=1;
            if(count<=2){
                nums[prev]=nums[i];
                prev++;
            }
        }
        for(int i:nums)System.out.println(i);
    }
    
}
