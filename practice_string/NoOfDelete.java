import java.util.*;
public class NoOfDelete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
    
        char[] ch=new char[s.length()];
        ch=s.toCharArray();
        int c=0;
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]==ch[i+1])
            {
                c++;
            }
        }
        System.out.println(c);
    }
    
}
