import java.util.*;
public class GenerateNumbersUsingGivenDigits {
    public static void main(String[] args) {
        Queue<String>que=new LinkedList<String>();
        int digitOne=5;
        int digitTwo=6;
       
        
        que.add(Integer.toString(digitOne));
        que.add(Integer.toString(digitTwo));
        for(int i=0;i<10;i++){
            System.out.println(que.peek());
            
            String s=que.remove();
            
            que.add(s+Integer.toString(digitOne));
            que.add(s+Integer.toString(digitTwo));
        }



    }
    
}
