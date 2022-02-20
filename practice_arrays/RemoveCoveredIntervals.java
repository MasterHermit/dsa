import java.util.*;
public class RemoveCoveredIntervals {
    static int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]));
        int count = 0, cur = 0;
        for(int interval[] : intervals){
            if(cur < interval[1]){
                cur = interval[1];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] intervals ={[1,2],[3,4],[5,6],[7,8]};
        System.out.print(removeCoveredIntervals(intervals));
        
    }
    
}
