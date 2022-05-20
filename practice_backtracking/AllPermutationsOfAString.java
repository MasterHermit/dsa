public class AllPermutationsOfAString {
    static void permutations(String str, String perm) {
        if (str.length() == 0) {
            if (perm.contains("AB") || perm.contains("BA"))
                System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutations(newStr, perm + cur);
        }

    }

    public static void main(String[] args) {
        String str = "ABC";

        permutations(str, "");
    }
}