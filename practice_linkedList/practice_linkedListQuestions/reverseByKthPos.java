public class reverseByKthPos {
    public class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
        }

    }

    public node head = null;
    public node tail = null;
    public boolean isfrst = true;

    public void add(int data) {
        node newn = new node(data);
        if (head == null) {
            head = newn;
            tail = newn;

        }
        tail.next = newn;
        tail = newn;

    }

    public void reverse(int k) {
        node cur = head;
        while (cur != null) {
            node frst = cur, prev = null;
            int c = 0;
            while (cur != null && c < k) {
                node next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
                c++;
            }
            if (isfrst) {
                head = prev;
                isfrst = false;
                tail = frst;
            } else {
                tail.next = prev;
                tail = frst;
            }
        }
    }

    public void display() {
        node cur = head;
        if (head == null)
            return;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        reverseByKthPos rbkp = new reverseByKthPos();
        rbkp.add(1);
        rbkp.add(2);
        rbkp.add(3);
        rbkp.add(4);
        rbkp.add(5);
        rbkp.add(6);
        rbkp.reverse(4);
        rbkp.display();

    }

}
