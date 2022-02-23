import java.util.*;

public class ThreeSumCloset {
    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int csum = Integer.MAX_VALUE;
        int res = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            int p1 = i + 1;
            int p2 = nums.length - 1;
            int sum = 0;
            while (p1 < p2) {
                sum = nums[i] + nums[p1] + nums[p2];
                int d = Math.abs(target - sum);
                if (sum == target) {
                    return sum;

                }
                if (d < (csum)) {
                    csum = d;
                    res = sum;

                }
                if (sum > target)
                    p2--;
                else
                    p1++;

            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] nums={-1,2,1,-4};
        int target=1;
        System.out.println(threeSumClosest(nums,target));

    }

}
