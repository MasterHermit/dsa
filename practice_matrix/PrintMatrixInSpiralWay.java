import java.util.*;

public class PrintMatrixInSpiralWay {
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
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(a[top][i]);

            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right]);
                
            }
            right--;
            for(int i=right;i>=left;i--)
            {
                System.out.print(a[bottom][i]);
        
            }
            bottom--;
            for(int i=bottom;i>=top;i--)
            {
                System.out.print(a[i][left]);
            }
            left++;
        }

    }
}
