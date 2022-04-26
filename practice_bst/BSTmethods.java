import java.util.*;
public class BSTmethods {
    public static void main(String[] args) {
        TreeSet<Integer>bst=new TreeSet<Integer>();
        bst.add(10);
        bst.add(20);
        bst.add(30);
        bst.add(4);
        bst.add(5);
        System.out.println(bst.size()); //5
        System.out.println(bst.isEmpty()); //false
        System.out.println(bst.first()); //4
        System.out.println(bst.last()); //30
        System.out.println(bst.lower(20)); //10
        System.out.println(bst.higher(20)); //30
        System.out.println(bst.floor(15)); //10
        System.out.println(bst.ceiling(90)); //null


    }
    
}
