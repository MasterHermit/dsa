import java.util.*;

public class prefixSufix {
    public static int longestPrefixSufix(String str){
        int len=str.length();
        int i=(len+1)/2;
        int count=0;
        if(len<2){
            return 0;
        }
        while(i<len){
            if(str.charAt(i)==str.charAt(count)){
                ++i;
                ++count;

            }else{
                i=i-count+1;
                count=0;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
      int length= longestPrefixSufix(str);
      System.out.println(length);
    }
    
}
