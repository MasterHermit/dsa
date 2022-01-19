
public class CircularLs {
    public class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;

        }
    }

    public node head = null;
    public node tail = null;

    public void add(int data) {
        node newn = new node(data);
        if (head == null) {
            // If list is empty, both head and tail would point to new node.
            head = newn;
            tail = newn;
            newn.next = head;
        } else {
            // tail will point to new node.
            tail.next = newn;
            // New node will become new tail.
            tail = newn;
            // Since, it is circular linked list tail will point to head.
            tail.next = head;
        }
    }

    public void InsertBeg(int data) {
        node newn = new node(data);
        if (head == null) {
            head = newn;
            newn.next = head;
            tail = newn;
        }

        newn.next = head;
        head = newn;
        tail.next = newn;

    }

    public void display() {
        node cur = head;
        if (head == null)
            return;
        do {
            System.out.println(cur.data);
            cur = cur.next;

        } while (cur != head);
    }

    public static void main(String[] args) {
        CircularLs ls = new CircularLs();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.InsertBeg(9);
        ls.InsertBeg(8);
        ls.InsertBeg(7);
        ls.display();

    }
}