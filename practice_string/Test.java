import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        StringBuilder ps=new StringBuilder();
        String pss=s.substring(0, 1);

        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                String check=s.substring(i, j+1);
                ps.append(check);
                ps.reverse();
                // System.out.println(ps);
                if(ps.toString().equals(check))
                {
                    if(pss.length()<check.length())
                    {
                        pss=check;
                    }
                }
                ps.delete(0, ps.length());
            }
        }
        System.out.println(pss);

       


     
    }

}