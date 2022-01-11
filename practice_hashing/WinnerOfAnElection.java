import java.util.*;
public class WinnerOfAnElection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        String [] a=new String[n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextLine();
       }
        LinkedHashMap<String,Integer>h=new LinkedHashMap<String,Integer>();
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(a[i]))
            {
                h.put(a[i],h.get(a[i])+1);
            }
            else{
                h.put(a[i], 1);
            }
        }
        int count=0;
        int max=0;
        for(Map.Entry<String,Integer>m:h.entrySet())
        {
            if(m.getValue()>1){
                max=Math.max(max,m.getValue());
            }
            if(m.getValue()==max) System.out.println(m.getKey());
        }
    }
    
}
