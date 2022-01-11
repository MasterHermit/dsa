import java.util.*;
public class LearningHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> h=new HashMap<String,Integer>();
        h.put("amit", 0);

        h.put("pruthwi",100);
        h.put("NoobaAmit",-1);
        System.out.println(h);
        System.out.println(h.size());
        for(Map.Entry<String,Integer>m:h.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }
        System.out.println(h.containsKey("amit"));
        h.remove("amit");
        System.out.println(h.containsValue(100));
        System.out.println(h.get("pruthwi"));
    }
    
}
