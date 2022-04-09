import java.util.*;

public class KfreqElement {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1, 2, 2, 3, 3, 3 };
        int k = 2;
        Map<Integer, Integer> hm = new HashMap<>();

        for (int num : nums)
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        int n = 0;
        int[][] mat = new int[hm.size()][2];

        for (Map.Entry map : hm.entrySet()) {
            mat[n][0] = (int) map.getKey();
            mat[n][1] = (int) map.getValue();
            n++;
        }
        Arrays.sort(mat, Comparator.comparingInt(row -> row[1]));
        // for(int i=0;i<mat.length;i++){
        // System.out.println(mat[i][0]+" "+mat[i][1]);
        // }
        int[] arr = new int[k];
        int j = 0;
        for (int i = hm.size() - 1; i >= hm.size() - k; i--) {
            arr[j] = mat[i][0];
            j++;
        }
        for (int a : arr) {
            System.out.println(a);
        }

    }

}
