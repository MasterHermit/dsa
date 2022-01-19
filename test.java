public class test {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(40);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);
        head.next.next.next.next.next = new node(50);
        head.next.next.next.next.next.next = new node(50);

        removeDuplicate(head);
        display(head);

    }

    static void removeDuplicate(node head) {

        node cur = head;
        if (head == null)
            return;
        while (cur != null && cur.next != null) {
            if (cur.data == cur.next.data)
                cur.next = cur.next.next;
            else
                cur = cur.next;
        }
    }

    static void display(node head) {
        node cur = head;
        while (cur != null) {
            System.out.println(cur.data + " =>");
            cur = cur.next;
        }

    }

}

class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
    }
}
