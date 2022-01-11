import java.util.*;
public class LongestSubArrayWithSum {
    public static void main(String[] args) {
        int[] a={8,3,1,5,-6,6,2,2};
        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
        int sum=4,res=0,s=0;

        for(int i=0;i<a.length;i++)
        {
            s+=a[i];
            if(s==sum)
            {
                res=i+1;
            }
            if(h.containsKey(s)==false)
            {
                h.put(s, i);
            }
            if(h.containsKey(s-sum))
            {
              int  m=h.get(s-sum);
                res=Math.max(res,i-m);
            }
        }
        System.out.println(res);
        
    }
    
}
