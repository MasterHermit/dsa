import java.util.*;

public class FirstNonRepeatingChar {

    static int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++)
            lhm.put(s.charAt(i), lhm.getOrDefault(s.charAt(i), 0) + 1);

        for (Map.Entry map : lhm.entrySet())
            if ((int) map.getValue() == 1)
                return s.indexOf((Character) map.getKey());

        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }


}
