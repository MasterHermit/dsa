import java.util.*;
import java.util.regex.Pattern;
import java.util.*;

public class Matcher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
//         Pattern p = Pattern.compile(".s");//. represents single character  
// Matcher m = p.matcher("as");  
// boolean b = m.matches(); 
        boolean check=Pattern.matches(".xx.", s);
        System.out.println(check);

    }
}