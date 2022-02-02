import java.util.*;
public class AllAnagramsInAString{
    public static List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length())return new ArrayList<>();
        List<Integer> anagramPos=new ArrayList<Integer>();
        
        int right=0,left=0;
        int[] a=new int[26];
        int[] b=new int[26];
        while(right<p.length()){
            a[p.charAt(right)-'a']++;
            b[s.charAt(right)-'a']++;
            right++;
        }
        right--;
        while(right<s.length()){
            if(Arrays.equals(a,b))
                anagramPos.add(left);
            
            right++;
            
            if(right<s.length())
            {
                b[s.charAt(left)-'a']--;
                b[s.charAt(right)-'a']++;
                left++;
            }
        }
   
        return anagramPos;
    }
    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
        List<Integer>l=new ArrayList<Integer>();
        l=findAnagrams(s,p);
        System.out.println(l);

        
    }


}