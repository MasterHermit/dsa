import java.util.*;

public class ContainsDuplicate {
    static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums)
            set.add(i);

        if (set.size() == nums.length)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(containsDuplicate(nums));
    }

}
