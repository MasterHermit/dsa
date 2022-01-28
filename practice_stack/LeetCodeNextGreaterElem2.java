import java.util.*;

public class LeetCodeNextGreaterElem2 {
    public static void main(String[] args) {
        int[] nums = { 10, 12, 9, 13, 7, 6 };

        int[] arr = nextGreaterElements(nums);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[i] >= st.peek())
                st.pop();
            st.push(nums[i]);
        }
        int[] result = new int[n];
        int index = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[i] >= st.peek())
                st.pop();
            result[index--] = st.isEmpty() ? -1 : st.peek();
            st.push(nums[i]);
        }
        return result;
    }

}
