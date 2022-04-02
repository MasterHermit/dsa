import java.util.*;
public class SubSequences {
    public static void main(String[] args) {
        String s="abc";
        char[] c =s.toCharArray();
        int n=s.length();
       // double len=Math.pow(2,n);
        for(int i=0; i<(1<<n); i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                if((i&(1<<j))!=0) sb.append(c[j]);
            }
            System.out.println(sb.toString());
        }
    }

    
}
