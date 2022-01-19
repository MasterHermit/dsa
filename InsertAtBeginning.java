public class InsertAtBeginning{

  static  class Node{
        int data;
        Node next;
       public Node(int data)
        {
            this.data=data;
        }
    }

   public static  Node insert(Node head,int data)
    {   
        Node toInsert=new Node(data);
        if(head==null) return toInsert;

        toInsert.next=head;
        head=toInsert;
        return head;
    }

//to display 
    static void display(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node newHead=insert(head,60);

        display(newHead);
        

    }
    
}
