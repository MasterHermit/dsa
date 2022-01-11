import java.util.*;
public class ReverseTranspose {
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
            for(int j=i+1;j<m;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            int s=0;int e=m-1;
            while(s<e)
            {
                int temp=a[s][i];
                a[s][i]=a[e][i];
                a[e][i]=temp;
                s++;
                e--;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
            
        }
    }
    
}
