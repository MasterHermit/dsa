class node<t> {
    t data;
    node next;

    node(t x) {
        data = x;
        next = null;
    }
}

public class Linkedlist {
    public static void print(node head) {
        node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

    }

    public static void main(String[] args) {

        node head = new node("10t");
        head.next = new node("20c");
        head.next.next = new node("30d");
        head.next.next.next = new node("40a");
        head.next.next.next.next = new node("50w");
        print(head);

    }
}