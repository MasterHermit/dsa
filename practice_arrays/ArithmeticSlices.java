public class ArithmeticSlices {
    static int numberOfArithmeticSlices(int[] nums) {
        int count_=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length-2;j++){
                if(nums[j]-nums[j+1]==nums[j+1]-nums[j+2])
                    count_++;
                else break;
            }
        }
        return count_;
        
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,6,7,8};
        System.out.print(numberOfArithmeticSlices(arr));
    }
    
}
