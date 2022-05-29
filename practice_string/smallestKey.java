public class smallestKey {
    static int smallest(int no1, int no2, int no3) {
        int d1 =0;
        int d2 = 0;
        int d3 = 0;
        int d = 0;
        while (no1 > 0) {
            d1 = no1 % 10;
            d2 = no2 % 10;
            d3 = no3 % 10;
            no1=no1/10;
            no2=no2/10;
            no3=no3/10;
            int min = 0;
            if (d1 < d2 && d1 <d3) {
                min = d1;
            } else if (d2 <d1 && d2 < d3) {
                min = d2;
            } else
                min = d3;

            d =d*10 + min;

        }
        StringBuilder sb= new StringBuilder();
        sb.append(Integer.toString(d));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        int no1 = 3521;
        int no2 = 1876;
        int no3 = 3421;
       int res= smallest(no1, no2, no3);
       System.out.println(res);
    }

}
