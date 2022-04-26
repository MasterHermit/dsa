import java.util.*;
public class LeftCeiling {
    public static void main(String[] args) {
        int[] arr={1,10,2,12,13,23,11,20};
        TreeSet<Integer>set=new TreeSet<>();
        set.add(arr[0]);
        System.out.println(-1);
        for(int i=1;i<arr.length;i++){
            if(set.ceiling(arr[i])!=null){
                System.out.println(set.ceiling(arr[i]));
            }
            else{
                System.out.println(-1);
            }
            set.add(arr[i]);

        }

    }
    
}
