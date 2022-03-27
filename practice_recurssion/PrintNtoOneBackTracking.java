public class PrintNtoOneBackTracking{
    static void print(int n,int i){
        if(i>n)return;
        print(n,i+1);
        System.out.println(i);

    }
    public static void main(String[] args) {
        print(10,1);
    }
}