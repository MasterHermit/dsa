import java.util.*;

import java.util.*;

public class ReturnNoTillOne {
    static void num(int n) {
        if (n < 1)
            return;

        System.out.print(n + " ");
       
        num(n - 1);
       
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        num(n);
        sc.close();

    }

}
