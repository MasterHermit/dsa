import java.util.*;

public class FindanReplaceinString {
    static int replace(String m, int n) {
        m = m.replace('2', 'a');
        m = m.replace('5', 'a');
        m = m.replace('6', 'b');
        m = m.replace('9', 'b');
        String no = Integer.toString(n);
        no = no.replace('2', 'a');
        no = no.replace('5', 'a');
        no = no.replace('6', 'b');
        no = no.replace('9', 'b');
       
        HashMap<Character, Integer> shm = new HashMap<>();
       
        for (int i = 0; i < m.length(); i++) {
            char ch = m.charAt(i);
            shm.put(ch, shm.getOrDefault(ch, 0) + 1);
        }
      
        int res = 0;
        int len = 0;
        boolean flag = true;
        int c=0;

        while (flag) {
            for (int i = 0; i < no.length(); i++) {
                char ch = no.charAt(i);
                if (shm.containsKey(ch)) {
                    shm.put(ch, shm.get(ch) - 1);
                    len++;
                    if (shm.get(ch) == 0) {
                        shm.remove(ch);

                        flag = false;
                    }

                }else {
                    flag=false;
                }
            }
            if (len == no.length()) {
                res++;
                len=0;
            }
           
        }
        return res;

    }

    public static void main(String[] args) {
        String m = "2234516659";
        int n = 56;
        int ans = replace(m, n);
        System.out.println(ans);

    }

}
