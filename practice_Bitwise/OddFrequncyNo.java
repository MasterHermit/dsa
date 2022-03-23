import java.util.*;

public class OddFrequncyNo {
    static int oddFrequncyNo(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(map.get(i), 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1 || entry.getValue() % 2 != 0)
                return entry.getKey();
        }
        return -1;

    }
    static int oddFrequncyNoBitWise(int[] nums){
        int res=0;
        for(int i:nums){
            res=res^i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 4, 4, 5, 5, 4 };
        System.out.println(oddFrequncyNo(nums));
        System.out.println(oddFrequncyNoBitWise(nums));
    }

}
