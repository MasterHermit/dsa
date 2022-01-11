import java.util.*;

public class LastIndexOf {
    static int last_index(int[] a,int n,int x){
        int l=0;
        int r=n-1;
        int res=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==x){
                res=m;
                l=m+1;
            }
            else if(a[m]<x){
                l=m+1;
            }
            else {
                r=m-1;
            }
        }
        return res;
    }
    // static int counter(int[] a,int n,int x){
    //     int res=last_index(a, n, x);
    //     int count=1;
    //     for(int i=res;i>=0;i++){
    //         if(a[i]==)

    //     }

    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int value=last_index(a,n,x);
        System.out.print(value);
        // int value2=counter(a, n, x);
        // System.out.println(value2);
    }

}
