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

    public static int maxLevel = 0;

    static void printLeftView(Node root, int level) {
        if (root == null)
            return;
        if (maxLevel < level) {
            System.out.print(root.key + " ");
            maxLevel = level;
        }
        printLeftView(root.left, level + 1);
        printLeftView(root.right, level + 1);
    }

    static boolean childrenSumProp(Node root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        int sum = 0;
        if (root.left != null)
            sum += root.left.key;
        if (root.right != null)
            sum += root.right.key;

        return (root.key == sum && childrenSumProp(root.left) && childrenSumProp(root.right));
    }

    static boolean balancedTree(Node root) {
        if (root == null)
            return true;
        int l = maxHeight(root.left);
        int r = maxHeight(root.right);
        return (Math.abs(l - r) <= 1 && balancedTree(root.left) && balancedTree(root.right));

    }

    static int maxWidth(Node root) {
        if (root == null)
            return 0;
        Queue<Node> q = new LinkedList<>();
        int res = 0;
        q.add(root);
        while (q.isEmpty() == false) {
            int count = q.size();
            res = Math.max(res, count);
            for (int i = 0; i < count; i++) {
                Node cur = q.poll();
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
        }
        return res;
    }

    static void spiralTraversal(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        q.add(root);
        boolean reverse = false;
        while (q.isEmpty() == false) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node cur = q.poll();
                if (!reverse) {
                    System.out.print(cur.key + " ");
                } else
                    stack.push(cur);

                if (cur.left != null)
                    q.add(cur.left);
                if (cur.right != null)
                    q.add(cur.right);
            }
            if (reverse) {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop().key + " ");
                }
            }
            reverse = !reverse;
            System.out.println();
        }
    }

    static void spiralTraversalOptimized(Node root) {
        if (root == null)
            return;
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);
        while (s1.isEmpty() == false || s2.isEmpty() == false) {
            while (s1.isEmpty() == false) {
                Node cur = s1.pop();
                System.out.print(cur.key + " ");
                if (cur.left != null)
                    s2.push(cur.left);
                if (cur.right != null)
                    s2.push(cur.right);

            }
            System.out.println();
            while (s2.isEmpty() == false) {
                Node cur = s2.pop();
                System.out.print(cur.key + " ");
                if (cur.right != null)
                    s1.push(cur.right);
                if (cur.left != null)
                    s1.push(cur.left);

            }
            System.out.println();
        }
    }

    public static int r = 0;

    static int maxDiameter(Node root) {
        if (root == null)
            return 0;

        int lh = maxDiameter(root.left);
        int rh = maxDiameter(root.right);
        r = Math.max(r, 1 + lh + rh);
        return 1 + Math.max(lh, rh);

    }

    static int getSizeFFBtree(Node root) {
        if (root == null)
            return 0;
        Node cur = root;
        int l = 0;
        while (cur != null) {
            l++;
            cur = cur.left;
        }
        cur = root;
        int r = 0;
        while (cur != null) {
            r++;
            cur = cur.right;
        }
        if (l == r)
            return (int) Math.pow(2, l) - 1;
        else
            return 1 + getSizeFFBtree(root.left) + getSizeFFBtree(root.right);

    }

    static int empty = -1;
    static ArrayList<Integer> list = new ArrayList<Integer>();

    static void serilaize(Node root, ArrayList<Integer> l) {
        if (root == null) {
            l.add(empty);
            return;
        }

        l.add(root.key);
        serilaize(root.left, l);
        serilaize(root.right, l);
    }

    static int index = 0;

    static Node deSerilaize(ArrayList<Integer> l) {
        if (index == l.size())
            return null;

        int val = l.get(index);
        index++;
        if (val == empty)
            return null;

        Node root = new Node(val);
        root.left = deSerilaize(l);
        root.right = deSerilaize(l);
        return root;

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.right = new Node(20);
        root.left = new Node(30);
        root.left.right = new Node(40);
        root.left.left = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.left.right.right = new Node(80);
        root.left.right.left = new Node(90);
        root.left.left.right = new Node(100);
        root.left.left.left = new Node(110);
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
        // levelTraversalOptimized(root);
        // printNodesAt(root,2);
        // printLeftView(root,1);
        // System.out.print(childrenSumProp(root));
        // balancedTree(root);
        // System.out.println(maxWidth(root));
        // spiralTraversalOptimized(root);
        // System.out.println(maxDiameter(root));
        // System.out.println(r);
        // System.out.println(getSizeFFBtree(root));
       // serilaize(root, list);
       // System.out.println(list);

    }

}