import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        
        for(int i=n-1;i>=1;i--){
            int count=1;
            if(a[i]==a[i-1]) {count++;}
           
            System.out.println(a[i]+" "+count);

        }
        
    }
    
}
