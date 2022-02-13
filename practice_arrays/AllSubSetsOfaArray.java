import java.util.*;
public class AllSubSetsOfaArray {
    static List<List<Integer>> allSubset = new ArrayList<>();
    static List<List<Integer>> subsets(int[] nums) {
        List<Integer> subSet = new ArrayList<>();
        findSubsets(nums, 0, subSet);
        return allSubset;
    }
    
    static void findSubsets(int[] nums, int index, List<Integer> subSet){
        allSubset.add(subSet);
        for(int i=index; i<nums.length; i++){
            List<Integer> newSubset = new ArrayList<>(subSet);
            newSubset.add(nums[i]);
            findSubsets(nums, i+1, newSubset);
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.print(subsets(nums));
        
    }
    
}
