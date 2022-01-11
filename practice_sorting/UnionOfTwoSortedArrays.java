import java.util.*;



public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;int j=0;
        while(i<n && j<m)
        {
            if(i>0 && a[i-1]==a[i])
            {
                i++;
                continue;
            }
            if(j>0 && b[j-1]==b[j])
            {
                j++;
                continue;
            }
            if(a[i]>b[j])
            {
                System.out.println(b[j]);
                j++;
            }
            else if(b[j]>a[i])
            {
                System.out.println(a[i]);
                i++;
            }
            else 
            {
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
        while(i<n){
            if(i==0 || a[i-1]!=a[i])
            {
                System.out.println(a[i]);
                i++;
            }
        }
        while(j<m){
           if(j==0 ||b[j-1]!=b[j])
           {
            System.out.println(b[j]);
            j++;
           }
        }

    }
    
}
