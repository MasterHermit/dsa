import java.util.*;
public class rough {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sign=(x<0)?-1:1;
        int num=0;
        while(Math.abs(x)>0)
        {
            int d=x%10;
            num*=10;
            num+=d;
            x=x/10;

        }
        System.out.println(num);
    }
    
}
