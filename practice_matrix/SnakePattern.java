import java.util.*;

public class SnakePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && i != 1) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j]+" ");
                }
            } else {
                for (int j = m-1; j >=0; j--) {
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }
}