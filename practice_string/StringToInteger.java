import java.util.*;
public class StringToInteger {
    static int findValue(String s)
    {
        if(s.length()==0) return 0;

        int sign=s.charAt(0)=='-'?-1:1;
        int i=(s.charAt(0)=='-' || s.charAt(0)=='+')?1:0;

        long num=0;

        while(i<s.length()&&Character.isDigit(s.charAt(i)))
        {
            int digit=s.charAt(i)-'0';
            num*=10;
            num+=digit;

            if(sign== -1 && num<Integer.MIN_VALUE)
            {
                return (int)(Integer.MIN_VALUE);
            }
            else if(sign==1 && num>Integer.MAX_VALUE)
            {
                return(int)Integer.MAX_VALUE;
            }
            i++;
            
            

        }
        return (int)(sign*num);


        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.trim();
        int value=findValue(s);
        System.out.println(value);
      
        
    }
    
}
