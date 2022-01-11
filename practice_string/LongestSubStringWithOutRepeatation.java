import java.util.*;
public class LongestSubStringWithOutRepeatation {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char[] ch=s.toCharArray();
    HashSet<Character>h=new HashSet<>();
    int p1=0,p2=0;
    int max=0;
    while(p2<s.length())
    {
        if(!h.contains(s.charAt(p2)))
        {
            h.add(s.charAt(p2));
            p2++;
            max=Math.max(max,h.size());
        }
        else{
            h.remove(s.charAt(p1));
            p1++;
        }
        
    }
    System.out.println(max);

 }


    
}
