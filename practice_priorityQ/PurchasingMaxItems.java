import java.util.*;
public class PurchasingMaxItems{
    public static void main(String[] args) {
        int[] arr={1,12,5,111,122};
        int total=130;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int res=0;
        for(int i=0; i<arr.length; i++)pq.add(arr[i]);

        while(!pq.isEmpty()){ 
            if(pq.peek()<=total){
                res++;
                total-=pq.poll();
            }
            else{
                break;
            }
        
        }
        System.out.println(res);
    }
}