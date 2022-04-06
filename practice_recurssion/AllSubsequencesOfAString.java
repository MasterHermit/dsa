import java.util.*;
public class AllSubsequencesOfAString {
    static void printSS(String s,String ans) {
       
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(0);
        String rest=s.substring(1);
        printSS(rest,ans+"");
        printSS(rest,ans+ch);
    }
   
    public static void main(String[] args) {
        String s="abc";
        String ans="";
        printSS(s, ans);
    
    }
    
}
