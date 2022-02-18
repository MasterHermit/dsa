import java.util.*;
public class RemoveKDigits {
    static String removeKdigits(String nums, int k) {
        if(nums.length()==0) return "0";
        Stack<Character> s=new Stack<>();
        int i=0;
        while(i<nums.length()){
            while(k>0 && !s.isEmpty() && s.peek()>nums.charAt(i))
            {
                s.pop();
                k--;
            }
            s.push(nums.charAt(i));
            i++;
        }
        while(!s.isEmpty() && k>0){
            s.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
            
        }
        sb.reverse();
        while(sb.toString().startsWith("0")){
            sb.deleteCharAt(0);
        }
        return sb.length()==0?"0":sb.toString();
    }
    public static void main(String[] args) {
        String s="100200";
        int k=3;
        System.out.println(removeKdigits(s,k));
        
    }
    
}
