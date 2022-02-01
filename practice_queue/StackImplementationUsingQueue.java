import java.util.*;
public class StackImplementationUsingQueue {
    public Queue<Integer> mainQue=new LinkedList<Integer>();
    public Queue<Integer>auxQue=new LinkedList<Integer>();
    void push(int x){
        while(!mainQue.isEmpty()){
           auxQue.offer(mainQue.poll());
        }
        mainQue.offer(x);
        while(!auxQue.isEmpty()){
            mainQue.offer(auxQue.poll());
        }

    }
    void pop(){
        mainQue.poll();
    }
    void display(){
       for(Integer i:mainQue){
           System.out.println(i);

       }
    }

   
    public static void main(String[] args) {
        StackImplementationUsingQueue sque= new StackImplementationUsingQueue();
        sque.push(10);
        sque.push(20);
        sque.push(30);
        sque.pop();
        sque.display();
        
        
    }
    
}
