import java.util.*;
public class FindNumInASortedMatrix {
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
        int x=sc.nextInt();
       int i=0,j=m-1;
       while(i<n && j>=0)
       {
           if(a[i][j]==x) {System.out.println(i+" "+j);break;}

          else if(a[i][j]>x) j--;
          else i++;

       }
       
    }
    
}
