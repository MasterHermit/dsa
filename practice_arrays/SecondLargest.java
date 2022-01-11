import java.util.*;
public class SecondLargest{
    static int secondLargest(int[] a){
        int largest=0;
        int secLargest=-1;
        for(int i=1;i<a.length;i++){
            if(a[i]>a[largest]){
                largest=i;
                secLargest=largest;
            }
            else if(a[i]!=a[largest]){
                if(secLargest==-1||a[i]>a[secLargest]){
                    secLargest=i;
                }

            }

        }
        return secLargest;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("size");
        int n = sc.nextInt();
        int[] a=new int[n];
        System.out.println("elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        int result=secondLargest(a);
        System.out.println(result);
    }
}