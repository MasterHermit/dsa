import java.util.*;

public class LeftMostReapeating {
    static int repeat(String s){
        int count[]=new int[256];
        Arrays.fill(count,-1);
        char[] ch=s.toCharArray();
        int res=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++)
        {
            if(count[ch[i]]==-1)
            {
                count[ch[i]]=i;
            }
            else{
                res=Math.min(res,count[ch[i]]);
                
            }
        
        }
       return (res!=Integer.MAX_VALUE)?res:-1;
        
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

    int index=repeat(s);
    System.out.println(index);
    }
    
}
