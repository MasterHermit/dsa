import java.util.*;
public class PermutationInString{
    static boolean checkInclusion(String s1, String s2) {
        int[] slide=new int[26];
        int[] total=new int[26];
        if(s1.length()>s2.length())return false;
        
        int left=0,right=0;
        while(right<s1.length())
        {
            slide[s1.charAt(right)-'a']++;
            total[s2.charAt(right)-'a']++;
            right++;
        }
        if(Arrays.equals(slide,total))return true;
        
        while(right<s2.length())
        {
            total[s2.charAt(left)-'a']--;
            total[s2.charAt(right)-'a']++;
            if(Arrays.equals(slide,total)) return true;
            left++;
            right++;
        }
        
        return false;
    }
    public static void main(String[] args) {
        String s1="abc";
        String s2="abcde";
        System.out.println(checkInclusion(s1,s2));
        
    }
}