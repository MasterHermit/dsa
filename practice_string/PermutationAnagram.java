import java.util.*;

public class PermutationAnagram {
    static boolean areSame(int[] a,int[] b)
    {
        int j=0;
        for(int i=0;i<256;i++)
        {
            if(a[i]!=b[i])
            {
                return false;
                
            }
           
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        char[] cs = s.toCharArray();
        char[] ts = t.toCharArray();
        int[] a=new int[256];
        int[] b=new int[256];
        boolean r=false;
        for (int i = 0; i < ts.length; i++) {
            a[cs[i]]++;
            b[ts[i]]++;

        }
        for(int i=ts.length;i<cs.length;i++)
        {
            if(areSame(a, b))
            a[cs[i]]++;
            a[i-ts.length]--;
        }
        System.out.println(r);

    }

}
