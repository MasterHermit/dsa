import java.util.*;
public class FindMissingAndReapeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);

        for(int i=0;i<n;i++){
            if(i==n-1){
                break;
            }
            if(a[i]==a[i+1]){
                System.out.println(a[i]);
            }
            if((a[i+1]-a[i])>1){
                System.out.println(a[i]+1);

            }
        }
    }
    
}
