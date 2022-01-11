import java.util.*;
public class PrintBoundaryElements {
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
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0 || j==0 || i==n-1 || j==m-1)
                {
                    System.out.print(a[i][j]+ " ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("the matrix was:");
        for (int i = 0; i < a.length; i++) {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
            
        }
    }
    
}
