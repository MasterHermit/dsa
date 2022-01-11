import java.util.*;

public class Palliandrome {
    static boolean palliandrome(String s, int i, int e) {
        if (i >= e)
            return true;

        if (s.charAt(i) != s.charAt(e))
            return false;

        return palliandrome(s, i + 1, e - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = 0;
        int end = s.length() - 1;
        boolean ispal = palliandrome(s, start, end);
        System.out.println(ispal);

    }

}
