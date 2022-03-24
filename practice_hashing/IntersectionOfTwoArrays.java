import java.util.*;
public class IntersectionOfTwoArrays {
    static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i:nums1)hm.put(i,hm.getOrDefault(hm.get(i),0)+1);
        
        for(int i=0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i]) && hm.get(nums2[i])>0){
                list.add(nums2[i]);
                hm.put(nums2[i],hm.get(nums2[i])-1);
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums1={4,5,4,9};
        int[] nums2={4,4,9,7,6,5};
        intersect(nums1, nums2);
        
        
    }
    
}
