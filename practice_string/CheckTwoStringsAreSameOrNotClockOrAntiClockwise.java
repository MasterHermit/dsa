import java.util.*;
public class CheckTwoStringsAreSameOrNotClockOrAntiClockwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        s1+=s1;
        if(s1.indexOf(s2)>=0)
        {
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
    
}
