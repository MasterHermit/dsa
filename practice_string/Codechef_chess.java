import java.util.*;

public class Codechef_chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int value = sc.nextInt();
            String match = sc.next();
            char[] ch = match.toCharArray();
            int c = 0, d = 0, n = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 'C')
                    c++;
                else if (ch[i] == 'D')
                    d++;
                else
                    n++;
            }
            if (n > c)

                System.out.println(40 * value);

            else if (c > n)
                System.out.println(60 * value);
            else
                System.out.println(55 * value);
        }
    }
}