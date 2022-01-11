import  java.util.*;
public class AllNegativeToOneSide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        int c=0;

        for(int i=0;i<n;i++)
        {
            
            if(a[i]>=0)
            {
                int temp=a[i];
                a[i]=a[c];
                a[c]=temp;
                c++;
            }
        }
        for(int i=0;i<n;i++) System.out.println(a[i]);

    }
    
}
