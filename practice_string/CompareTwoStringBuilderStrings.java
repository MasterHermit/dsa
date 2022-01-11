import java.util.*;

public class CompareTwoStringBuilderStrings {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
       
        StringBuilder s=new StringBuilder();
        s.append(A);
        s.reverse();
        if(s.toString().equals(A.toString()))
        System.out.print("Yes");
        else System.out.print("No");
  
        
    }
}
