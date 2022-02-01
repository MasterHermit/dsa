public class DoubleLinkedList {
    public class node {
        int data;
        node next;
        node prev;

        public node(int data) {
            this.data = data;
        }
    }

    public node head = null, tail = null;

    public void add(int data) {
        node newn = new node(data);
        if (head == null) {
            head = newn;
            tail = newn;
            head.prev = null;
            tail.next = null;
            return;
        }
        tail.next = newn;
        newn.prev = tail;
        tail = newn;
        tail.next = null;

    }

    public void InsertBeg(int data) {
        node newn = new node(data);
        if (head == null) {
            head = tail = newn;
            head.prev = null;
            tail.next = null;
            return;
        }

        newn.next = head;
        head.prev = newn;
        head = newn;
        head.prev = null;

    }

    public void reverse() {
        node cur = head;

        if (head == null || head.next == null)
            return;

        node temp = null;
        while (cur != null) {
            temp = cur.next;

            cur.next = cur.prev;
            cur.prev = temp;
            cur = cur.prev;

        }
        temp = head;
        head = tail;
        tail = temp;

    }

    public void deleteHead() {
        if (head == null || head.next == null)
            return;
        head = head.next;
        head.prev = null;
    }

    public void deletelast() {
        if (head == null || head.next == null)
            return;

        tail = tail.prev;
        tail.next = null;
    }

    public void display() {
        if (head == null)
            return;
        node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList dls = new DoubleLinkedList();
        dls.add(10);
        dls.add(20);
        dls.add(30);
        dls.add(40);
        dls.InsertBeg(9);
        dls.reverse();
        dls.deleteHead();
        dls.deletelast();
        dls.display();

    }

}
