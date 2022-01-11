import java.util.*;
public class SquareRoot {
    static int square_root(int[] a,int n,int x){
        int l=0;
        int r=n-1;
        int res=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(m*m==x){
                res=m;
            }
            else if(m*m>x){
                r=m-1;
            }
            else{
                l=m+1;
                res=m;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        int x = sc.nextInt();
        int[] a = new int[x];

        for (int i = 0; i < x; i++) {
            a[i] = i;}
        int n=a.length;
        int value=square_root(a,n,x);
        System.out.print(value);
    }
    
}
