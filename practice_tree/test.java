import java.util.*;

public class test {
    static int findMinNumber(int n) {
        int count = 0, ans = 1;

        while (n % 2 == 0) {
            count++;
            n /= 2;
        }

        if (count % 2 == 1)
            ans *= 2;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            count = 0;
            while (n % i == 0) {
                count++;
                n /= i;
            }

            if (count % 2 == 1)
                ans *= i;
        }

        if (n > 2)
            ans *= n;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(findMinNumber(n));

    }
}