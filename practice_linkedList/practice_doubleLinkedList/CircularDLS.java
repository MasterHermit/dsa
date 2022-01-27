public class CircularDLS {
    public class node {
        int data;
        node next;
        node prev;

        public node(int data) {
            this.data = data;
        }
    }

    public node head = null;

    public void insertBeg(int data) {
        node newn = new node(data);
        if (head == null) {
            head = newn;
            head.next = head;
            head.prev = head;
        }
        newn.next = head;
        newn.prev = head.prev;
        head.prev.next = newn;
        head.prev = newn;
        head = newn;

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
        CircularDLS cdls = new CircularDLS();
        cdls.insertBeg(10);
        cdls.insertBeg(9);
        cdls.insertBeg(8);
        cdls.display();

    }

}
