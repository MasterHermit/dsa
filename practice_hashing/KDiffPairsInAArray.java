import java.util.*;
public class KDiffPairsInAArray {
    static int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int result = 0;
        for (int i : map.keySet())
            if (k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1)
                result++;
        return result;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int k=1;
        System.out.println(findPairs(nums,k));
    }
    
}
