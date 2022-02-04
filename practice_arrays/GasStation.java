public class GasStation {
    static int canCompleteCircuit(int[] gas, int[] cost) {
        
        
        int start=0,prev=0,cur=0;
            for(int i=0;i<gas.length;i++){
                cur+=(gas[i]-cost[i]);
                    if(cur<0){
                        start=i+1;
                        prev+=cur;
                        cur=0;
                    }
            }
            return ((prev+cur)>=0)?start:-1;
            
            
        }
    public static void main(String[] args) {
        int[] gas={2,3,4};
        int[] cost={3,4,3};
        System.out.print(canCompleteCircuit(gas, cost));
        
    }
    
}
