import java.util.*;

public class binarySearch {
     int bsearch( int no, int[] arr) {
        int l=0;int r=arr.length-1;
          while(l<=r){
              int mid=l+(r-l) /2;

              if(arr[mid]==no){
                  return mid;
              }
              if(arr[mid]<no)
              l=mid+1;
              else
              r=mid-1;
          }
 
         return -1;
     }

    public static void main(String[] args) {
        binarySearch ob =new binarySearch();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int no = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         int f =ob.bsearch(no,arr);
      if(f==-1){
             System.out.print("false");
          }else System.out.print("true");
     
    }

}
