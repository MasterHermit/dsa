public class CountSetBit {
    public static void main(String[] args) {
        int n=40;
        int res=0;
        while(n>0){
            n=(n&(n-1));
            res++;
        }
        System.out.println(res);
    }
    
}
