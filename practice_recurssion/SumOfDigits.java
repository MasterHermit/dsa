import java.util.*;

public class SumOfDigits {
    static int sum(int n) {
        if (n < 10)
            return n;

        return sum(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int val = sum(num);
        System.out.println(val);
    }
}
