
public class CountingBits {
    static int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
           
            arr[i]=Integer.bitCount(i);
            
        }
        return arr;
        
    }
    public static void main(String[] args) {
        int n=6;
        int[] arr=countBits(n);
        for(int i:arr)System.out.println(i);
    }
    
}
