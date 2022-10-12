import java.util.*;

public class BTreeFromAnArray {
    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private static class Pair {
        Node root;
        int c;

        Pair(Node root, int c) {
            this.root = root;
            this.c = c;
        }
    }

    static void display(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        display(root.left);
        display(root.right);
    }

    static void iterativeDisplay(Node root) {
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> post = new ArrayList<>();

        Stack<Pair> s = new Stack<>();
        Pair fp = new Pair(root, 1);
        s.push(fp);
        while (!s.isEmpty()) {
            Pair top = s.peek();
            if (top.c == 1) {
                pre.add(top.root.data);
                if (top.root.left != null) {
                    Pair nlp = new Pair(top.root.left, 1);
                    s.push(nlp);
                }
                top.c++;
            } else if (top.c == 2) {
                in.add(top.root.data);
                if (top.root.right != null) {
                    Pair nrp = new Pair(top.root.right, 1);
                    s.push(nrp);
                }
                top.c++;
            } else {
                post.add(top.root.data);
                s.pop();
            }
        }
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);

    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };

        Node root = new Node(arr[0], null, null);
        Pair p = new Pair(root, 1);

        Stack<Pair> s = new Stack<Pair>();
        s.push(p);
        int i = 0;
        while (!s.isEmpty()) {
            Pair top = s.peek();
            if (top.c == 1) {
                i++;
                if (arr[i] != null) {
                    Node lc = new Node(arr[i], null, null);
                    top.root.left = lc;
                    Pair pl = new Pair(lc, 1);
                    s.push(pl);

                } else {
                    top.root.left = null;
                }
                top.c++;

            } else if (top.c == 2) {
                i++;
                if (arr[i] != null) {
                    Node rc = new Node(arr[i], null, null);
                    top.root.right = rc;
                    Pair pr = new Pair(rc, 1);
                    s.push(pr);

                } else {
                    top.root.right = null;
                }
                top.c++;

            } else {
                s.pop();
            }
        }

        // display(root);
        iterativeDisplay(root);

    }
}