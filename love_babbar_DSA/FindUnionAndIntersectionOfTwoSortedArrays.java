import java.util.*;

public class FindUnionAndIntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 3, 4, 5, 7, 8 };

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);
        for (int i = 0; i < arr2.length; i++)
            hs.add(arr2[i]);

        System.out.println(hs);

        HashSet<Integer> hs2 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++)
            hs2.add(arr1[i]);

            List<Integer> l=new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            if ((hs2.contains(arr2[i]))) {
                l.add(arr2[i]);
            }
        }
        System.out.println(l);

    }

}
