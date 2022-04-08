import java.util.*;

class Node {
    int key;
    Node right;
    Node left;

    Node(int key) {
        this.key = key;

    }
}

public class BinaryTreeImplementation {

    static void displayInorder(Node root) {
        if (root != null) {
            displayInorder(root.left);
            System.out.print(root.key + " ");

            displayInorder(root.right);

        }

    }

    static void displayPreorder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            displayPreorder(root.left);
            displayPreorder(root.right);
        }

    }

    static void displayPostorder(Node root) {
        if (root != null) {

            displayPostorder(root.left);
            displayPostorder(root.right);
            System.out.print(root.key + " ");
        }

    }

    static int getSize(Node root) {
        if (root == null)
            return 0;
        else
            return 1 + getSize(root.left) + getSize(root.right);
    }

    static int maxValue(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        else
            return Math.max(root.key, Math.max(maxValue(root.left), maxValue(root.right)));

    }

    static int maxHeight(Node root) {
        if (root == null)
            return 0;
        else
            return Math.max(maxHeight(root.left), maxHeight(root.right)) + 1;
    }

    static void iterativeInorder(Node root) {
        Stack<Node> s = new Stack<>();
        Node cur = root;
        while (cur != null || s.isEmpty() == false) {
            while (cur != null) {
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            System.out.println(cur.key);
            cur = cur.right;

        }
    }

    static void iterativePreorder(Node root) {
        Stack<Node> s = new Stack<>();
        if (root == null)
            return;

        s.push(root);
        while (s.isEmpty() == false) {
            Node cur = s.pop();
            System.out.println(cur.key);
            if (cur.right != null)
                s.push(cur.right);
            if (cur.left != null)
                s.push(cur.left);
        }
    }

    static void iterativeOptimized(Node root) {
        Stack<Node> s = new Stack<>();
        Node cur = root;

        while (s.isEmpty() == false || cur != null) {
            while (cur != null) {
                System.out.println(cur.key);
                if (cur.right != null)
                    s.push(cur.right);
                cur = cur.left;
            }
            if (s.isEmpty() == false)
                cur = s.pop();
        }
    }

    static void levelOrdTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root == null)
            return;
        q.add(root);
        q.add(null);
        while (q.size() > 1) {
            Node cur = q.poll();
            if (cur == null) {
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(cur.key + " ");
            if (cur.left != null)
                q.add(cur.left);
            if (cur.right != null)
                q.add(cur.right);
        }

    }

    static void levelTraversalOptimized(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.isEmpty() == false) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node cur = q.poll();
                System.out.print(cur.key + " ");
                if (cur.left != null)
                    q.add(cur.left);
                if (cur.right != null)
                    q.add(cur.right);
            }
            System.out.println();
        }
    }

    static void printNodesAt(Node root, int k) {
        if (root == null)
            return;
        if (k == 0) {
            System.out.print(root.key + " ");
        }
        printNodesAt(root.left, k - 1);
        printNodesAt(root.right, k - 1);
    }
    public static int maxLevel=0;
    static void printLeftView(Node root,int level){
        if(root == null)return;
       if(maxLevel<level){
           System.out.print(root.key + " ");
           maxLevel=level;
       }
       printLeftView(root.left, level+1);
       printLeftView(root.right, level+1);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.right = new Node(20);
        root.left = new Node(30);
        root.left.right = new Node(40);
        root.left.left = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.left.right.right= new Node(80);
        // displayInorder(root);
        // displayPreorder(root);
        // displayPostorder(root);
        // System.out.println();
        // System.out.println(getSize(root));
        // System.out.println(maxValue(root));
        // System.out.println(maxHeight(root));
        // iterativeInorder(root);
        // iterativePreorder(root);
        // iterativeOptimized(root);
        // levelOrdTraversal(root);
        //levelTraversalOptimized(root);
        //printNodesAt(root,2);
        printLeftView(root,1);
    }

}