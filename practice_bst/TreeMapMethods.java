import java.util.*;
public class TreeMapMethods {
    public static void main(String[] args) {
        TreeMap<Integer,String>tm=new TreeMap<>();
        tm.put(10,"amit");
        tm.put(20,"sardha");
        tm.put(3,"hermit");
        tm.put(9,"master");
        System.out.println(tm); //{3=hermit, 9=master, 10=amit, 20=sardha}
        System.out.println(tm.containsKey(10)); //true
        System.out.println(tm.get(20)); //sardha
        System.out.println(tm.floorKey(30)); //20
        System.out.println(tm.ceilingKey(12)); //20
        System.out.println(tm.lowerKey(10)); //9
        //System.out.println(tm.upperKey(10));
        System.out.println(tm.firstKey()); //3
        System.out.println(tm.lastEntry()); //20=sardha

        for(Map.Entry<Integer,String>map:tm.entrySet()){
            System.out.print(map.getKey()+":"+map.getValue()+"  ");
            //3:hermit  9:master  10:amit  20:sardha
        }


    }
    
}
