public class ImplementationUsingSinglyLinkedList {
    public class node {
        node next;
        int x;

        public node(int x) {
            this.x = x;

        }
    }

    public node head = null;
    public node tail = null;

    void enque(int x) {
        node newn=new node(x);
        if(head==null){
            head = newn;
            tail = newn;
        }
        tail.next=newn;
        tail=newn;
    }
    void deque() {
        if(head==null ){return;}
        head=head.next;
        if(head==null){tail=null;}

    }

    public static void main(String[] args) {
        ImplementationUsingSinglyLinkedList que = new ImplementationUsingSinglyLinkedList();

    }

}
