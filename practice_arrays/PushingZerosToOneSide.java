
//objective is to push all the 0 to one side of an array and non zeros to other side in the exact sequence they were present.
import java.util.*;

public class PushingZerosToOneSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println();
        int count=0;
        for (int i = 0; i < n; i++) {
            int temp;
            if(a[i]!=0){
                temp=a[i];
                a[i]=a[count];
                a[count]=temp;
                count++;

            }
           
                
            
        }
        System.out.println("array after:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }

}
