import java.util.*;
public class ExcelSheetColumnNo {
    static int titleToNumber(String s) {
        if(s.length()==0)return -1;
        int sum=0;
        
        for(char ch:s.toCharArray()){
            sum*=26;
            sum+=ch-'A'+1;
        }
        return sum;
        
    }
        public static void main(String[] args) {
            String s="ABC";
            System.out.println(titleToNumber(s));
        
    }
    
}
