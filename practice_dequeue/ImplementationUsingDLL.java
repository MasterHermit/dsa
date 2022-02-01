public class ImplementationUsingDLL {
    public class node {
        int data;
        node next;
        node prev;

        public node(int x) {
            data = x;

        }
    }

    public node head = null;
    public node tail = null;

    void insertBeg(int x){
        node newn = new node(x);
        if(head == null){
            head = newn;
            tail= newn;
            head.prev = null;
            tail.next=null;
            return;

        }
        newn.next = head;
        head.prev = newn;
        head=newn;
        head.prev = null;
    }
    void insertEnd(int x){
        node newn = new node(x);
        if(head==null){
            head=newn;
            tail=newn;
            head.prev = null;
            tail.next = null;
            return;
         
        }
        tail.next=newn;newn.prev=tail;
        tail=newn;
        tail.next=null;
    }
    void deleteBeg(){
        if(head==null){return;}
        head=head.next;
        if(head==null){tail=null;}
        head.prev=null;
    }
    void deleteEnd(){
        if(head== null)return;
        tail=tail.prev;
        if(tail==null)head=null;
        tail.next=null;
    }
    void display(){
        if(head== null) return;
        node cur = head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        ImplementationUsingDLL qdll= new ImplementationUsingDLL();
        qdll.insertBeg(10);
        qdll.insertBeg(20);
        qdll.insertBeg(30);
        qdll.display();


    }
}