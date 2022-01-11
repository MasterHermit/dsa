import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[][] a=new int[4][3];
    int[][] b=new int[3][3];
    int[][] c=new int[4][3];
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<3;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            b[i][j]=sc.nextInt();
        }
    }
   
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<3;j++)
        {
            c[i][j]=0;
            for(int k=0;k<3;k++)
            {
                c[i][j]+=a[i][k]*b[k][j];
            }
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
    }


    }
    
}
