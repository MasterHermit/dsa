import java.util.*;

public class test2 {
    int solve(String s, int N) {
        String n = Integer.toString(N);
        s = s.replace('2', 'a');
        s = s.replace('5', 'a');
        s = s.replace('6', 'b');
        s = s.replace('9', 'b');
        n = n.replace('2', 'a');
        n = n.replace('5', 'a');
        n = n.replace('6', 'b');
        n = n.replace('9', 'b');

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);

        }

        boolean flag = true;
        int c=0;
          

        while(flag){

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (hm.containsKey(ch)) {
           
                hm.put(ch, hm.get(ch) - 1);
                if (hm.get(ch) == 0){
                    hm.remove(ch);
                flag = false;
                }

            } else {
                flag = false;
            }
           
        }
        c++;
  
    }
    return c;


    }

    public static void main(String[] args) {
        test2 t = new test2();
        String s = "5276978";
        int N = 56;
        int res = t.solve(s, N);
        System.out.println(res);

    }
}