import java.util.*;

public class PatternSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] sa = s.toCharArray();
        String p = sc.nextLine();
        char[] pa = p.toCharArray();
        int n = s.length();
        int m = p.length();
        for (int i = 0; i < n - m; i++) {
            int j=0;
            for ( j = 0; j < m; j++) {
                if (sa[i + j] != pa[j])
                    break;

            }
            if(j==m) System.out.println(i);
        }
    }

}
