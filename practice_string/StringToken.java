//using tokenizer class

import java.util.*;

public class StringToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s= sc.nextLine();
       StringTokenizer st=new StringTokenizer(s,"A-Z !,?._'@ ");
       int count=st.countTokens();
       System.out.println(count);
       while(st.hasMoreTokens()){
           System.out.println(st.nextToken());
       }
    }
    
}
