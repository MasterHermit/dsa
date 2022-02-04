import java.util.*;
public class MaxContigousArrayOfBinary {
    public static void main(String[] args) {
        Map<Integer, Integer>hm=new HashMap<>();
        int[] a={1,1,1,1,1,1};
        int sum=0,res=0;
        hm.put(0,-1);
        for(int i=0;i<a.length;i++){
            if(a[i]==1) sum++;
            else sum--;

            if(hm.containsKey(sum)){
                res=Math.max(res,i-hm.get(sum));
            }else hm.put(sum,i);
        }
        System.out.println(res);
    }
    
}
