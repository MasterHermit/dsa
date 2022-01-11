import java.util.*;

public class linearSearch {
    public static int linearsearch(int[] arr, int no) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == no)
                return i;

        }

        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int no = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = linearsearch(arr, no);
        System.out.println(index);
    }
}
