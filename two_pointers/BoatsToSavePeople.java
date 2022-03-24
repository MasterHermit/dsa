import java.util.*;
public class BoatsToSavePeople{
   static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start=0;
        int end=people.length-1;
        int boat=0;
        while(start<=end){
            if(people[start]+people[end]>limit){
                end--;
                boat++;
                
            }else{
                start++;
                end--;
                boat++;
            }
        }
        
        return boat;
        
    }
    public static void main(String[] args) {
        int[] nums={1,2};
        int limit=3;
        System.out.println(numRescueBoats(nums, limit));

    }
}