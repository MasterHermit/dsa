import java.util.*;

public class LexiographicalString {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String check="No";
        if(str1.compareTo(str2)>0)
        check="Yes";
        System.out.println(check);
    }
    
}
