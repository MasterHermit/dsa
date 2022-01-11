import java.util.*;
public class AllSubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.nextLine();
        
        for(int i=0;i<s.length();i++)
        {
            String st="";
            
            for(int j=i;j<s.length();j++)
            {
                st+=s.charAt(j);
                
                System.out.println(st);
            }
        }
    }
    
}
