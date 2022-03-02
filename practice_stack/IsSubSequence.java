import java.util.*;
public class IsSubSequence {
    static boolean isSubsequence(String s, String t) {
        if(s.length()==0)return true;
        
       Stack<Character>stack=new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
            stack.push(s.charAt(i));
        
        for(int i=0;i<t.length();i++)
        {
            if(stack.peek()==t.charAt(i))
                stack.pop();
            if(stack.isEmpty()) return true;
        }
        
        return stack.isEmpty();
        
        
    }
    public static void main(String[] args) {
        String s="abc";
        String t="acbcddabc";
        System.out.println(isSubsequence(s, t));

    }
    
}
