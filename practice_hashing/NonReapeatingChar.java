import java.util.*;
public class NonReapeatingChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] c=new char[s.length()];
        c=s.toCharArray();
        LinkedHashMap<Character,Integer>h=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<c.length;i++){
            if(h.containsKey(c[i]))
            {
                h.put(c[i], h.get(c[i])+1);
            }
            else
            {
                h.put(c[i],1);
            }
        }
        
        for(Map.Entry<Character,Integer>m:h.entrySet())
        {
            if(m.getValue()==1)
            {
                System.out.println(m.getKey());
                System.out.println(Arrays.binarySearch(c, m.getKey()));
                break;
            }
        }
        
    }
    
}

