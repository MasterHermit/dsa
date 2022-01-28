//the logic is we will traverse the nums2 array from the end if we will find any no bigger than //current then we will pop the stack until we get a more greater element.
//after pop operation check if stack is empty or not
//if empty that means no greater element will be there so update hashmap with nums2[i] &-1
//else update hashmap with nums2[i] & stack.peek() as we already poped all the smaller elements //from stack
//now i think you can find the solution for nums1 

import java.util.*;

public class LeetCodeNextGreaterElem1 {
    public static void main(String[] args) {
        int[] nums1 = { 2, 4 };
        int[] nums2 = { 1, 2, 3, 4 };

        int[] arr = nextGreaterElement(nums1, nums2);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        hm.put(nums2[nums2.length - 1], -1);
        stack.push(nums2[nums2.length - 1]);

        for (int i = nums2.length - 2; i >= 0; i--) {
            while (stack.isEmpty() == false && (nums2[i] > stack.peek()))
                stack.pop();

            if (stack.isEmpty())
                hm.put(nums2[i], -1);
            else
                hm.put(nums2[i], stack.peek());

            stack.push(nums2[i]);
        }
        int[] arr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            if (hm.containsKey(nums1[i])) {
                arr[i] = hm.get(nums1[i]);
            }
        }
        return arr;
    }

}
