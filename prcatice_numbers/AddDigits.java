public class AddDigits {
    static int addDigits(int num) {
        if (num == 0)
            return 0;

        else if (num % 9 == 0)
            return 9;

        return (num % 9);

    }

    public static void main(String[] args) {
        System.out.println(addDigits(98));

    }
}