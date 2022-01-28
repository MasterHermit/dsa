<<<<<<< HEAD

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
            tail = newn;
            newn.next = head;

        }

        newn.next = head;
        head = newn;
        tail.next = newn;

    }

    public void InsertEnd(int data) {
        node newn = new node(data);
        if (head == null) {
            head = newn;
            tail = newn;
            tail.next = head;
        }
        tail.next = newn;
        tail = newn;
        tail.next = head;
    }

    // more efficient solution
    // insert new node after head than swap their values
    public void InsertEndEff(int data) {
        node newn = new node(data);
        if (head == null) {
            head = newn;
        }
        newn.next = head.next;
        head.next = newn;
        // swap
        int temp = head.data;
        head.data = newn.data;
        newn.data = temp;

        head = newn;

    }

    public void deleteHead() {
        if (head == null)
            return;
        if (head.next == null)
            return;
        tail.next = head.next;
        head = head.next;
    }

    public void deleteKthNode(int k) {
        node curr = head;
        if (head == null)
            return;
        if (k == 1) {
            tail.next = head.next;
            head = head.next;
            return;
        }
        for (int i = 0; i < k - 2; i++) {
            if (curr == head) {
                return;
            }
            curr = curr.next;
        }
        curr.next = curr.next.next;

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
        ls.InsertEnd(40);
        ls.InsertEnd(50);
        ls.InsertEndEff(60);
        // ls.deleteHead();
        ls.deleteKthNode(10);

        ls.display();

    }
=======

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
>>>>>>> 233302528be0a3e9061dc2868fb6ef8fc418b5b0
}