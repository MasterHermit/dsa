import java.util.*;

public class AnagramO_n {
    static boolean check(String s1, String s2) {
        int count[] = new int[256];
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            count[ch1[i]]++;

        }
        for (int i = 0; i < s2.length(); i++) {
            count[ch2[i]]--;

        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0)
                return false;

        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        boolean value = check(s1, s2);
        System.out.print(value);

    }

}
