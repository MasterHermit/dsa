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
    static void iterativeOptimized(Node root){
        Stack<Node>s= new Stack<>();
        Node cur=root;
        
        while(s.isEmpty()==false || cur!=null) {
            while(cur!=null){
                System.out.println(cur.key);
                if(cur.right!= null)s.push(cur.right);
                cur= cur.left;
            }
            if(s.isEmpty()==false)
            cur=s.pop();
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.right = new Node(20);
        root.left = new Node(30);
        root.left.right = new Node(40);
        root.left.left = new Node(50);
        // displayInorder(root);
        // displayPreorder(root);
        // displayPostorder(root);
        // System.out.println();
        // System.out.println(getSize(root));
        // System.out.println(maxValue(root));
        // System.out.println(maxHeight(root));
        // iterativeInorder(root);
        //iterativePreorder(root);
        iterativeOptimized(root);
    }

}