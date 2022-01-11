import java.util.*;
public class LeftMostNonRepeating {
    static int non_repeating(String s){
        int count[]=new int[256];
        Arrays.fill(count,-1);
        char[] ch=s.toCharArray();
        int res=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++)
        {
            if(count[ch[i]]==-1)
            {
                count[ch[i]]=i;
            }else count[ch[i]]=-2;
        }
        for(int i=0;i<256;i++){
            if(count[i]>=0)
            {
                res=Math.min(res,count[i]);
            }
        }
        return (res!=Integer.MAX_VALUE)?res:-1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int value=non_repeating(s);
        System.out.println(value);
    }
    
}
