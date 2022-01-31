public class EffiecientQueImpln {
    int cap, size,front;
    int[] array;

    EffiecientQueImpln(int c) {
        cap = c;
        size = 0;
        array = new int[cap];
        front=0;

    }
    void enque(int x){
        if(isFull()) System.out.println("queue is full");
        int rear=getRear();
        
        rear=(rear+1)%cap;
        array[rear]=x;
        
        size++;
        
    }
    void deque(){
        if(isEmpty())System.out.println("queue is empty");
        front=(front+1)%cap;
        size--;

    }
    boolean isFull(){
        if(size==cap) return true;
        return false;
    }
    boolean isEmpty(){
        if(size==0)return true;
        return false;
    }
    int getRear(){
        if(isEmpty()) return -1;
        return (size+front-1)%cap;
    }
    int getFront(){
        if(isEmpty()) return -1;
        return front;
    }
    void display(){
        int fron = getFront();
        for(int i=0;i<size;i++){
            System.out.print(array[fron]);
            fron=(fron+1)%cap;

        }
    }
    public static void main(String[] args) {
        EffiecientQueImpln eque=new EffiecientQueImpln(4);
        eque.enque(10);
        eque.enque(10);
        eque.enque(10);
        eque.enque(10);
        eque.deque();
        eque.display();
    }

}
