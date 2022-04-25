import java.util.*;

public class largest {
    static int lNum(int n) {
        int number = n;
        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }
        Arrays.sort(numbers);
        int num =0;
        for (int i = numbers.length - 1; i >= 0; i--)

        {
            num = num * 10 + numbers[i];
        }
        return num;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(lNum(n));
    }

}
