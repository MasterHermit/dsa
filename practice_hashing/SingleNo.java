import java.util.*;
public class SingleNo {
    static int singleNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i : nums) {
			if(set.contains(i)) {
				set.remove(i);
			} else{
				set.add(i);
			}
		}

		for(int i:set) {
			return i;
		}
		return -1;
	}
    public static void main(String[] args) {
        int[] nums={1,2,2,4,4,3,3};

        System.out.println(singleNumber(nums));

    }
    
}
