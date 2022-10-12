public class BST_from_sorted_array {
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

    static Node construct(int[] arr, int lo, int hi) {
        if (lo > hi)
            return null;

        int mid = (lo + hi) / 2;
        int md = arr[mid];
        Node lc = construct(arr, lo, mid - 1);
        Node rc = construct(arr, mid + 1, hi);
        return new Node(md, lc, rc);

    }

    static Node insert(int data, Node root) {

        if (root == null) {
            root = new Node(data, null, null);
        }

        if (data < root.data) {
            root.left = insert(data, root.left);
        } else if (data > root.data) {
            root.right = insert(data, root.right);
        }

        return root;
    }

    static int lmax(Node root) {
        if (root.right != null)
            return lmax(root.right);
        else
            return root.data;
    }

    static Node delete(int data, Node root) {
        if (root == null)
            return null;

        if (data < root.data) {
            root.left = delete(data, root.left);
        } else if (data > root.data) {
            root.right = delete(data, root.right);
        } else {
            if (root.left != null && root.right != null) {
                int max = lmax(root.left);
                root.data = max;
                root.left = delete(max, root.left);
                return root;

            } else if (root.left != null) {
                return root.left;
            } else if (root.right != null) {
                return root.right;
            } else {
                return null;
            }
        }
        return root;

    }

    static int size(Node root) {
        if (root == null)
            return 0;

        int ls = size(root.left);
        int rs = size(root.right);

        return 1 + ls + rs;
    }

    static int maxNo(Node root) {
        if (root.right != null) {
            return maxNo(root.right);
        } else {
            return root.data;
        }
    }

    static int minNo(Node root) {
        if (root.left != null) {
            return minNo(root.left);
        } else {
            return root.data;
        }
    }

    static void display(Node root) {
        if (root == null)
            return;

        display(root.left);
        System.out.print(root.data + " ");
        display(root.right);
    }

    public static void main(String[] args) {
        Node root = null;

        int[] arr = { 10, 20, 23, 25, 30, 56, 71 };
        root = construct(arr, 0, arr.length - 1);

        insert(100, root);
        delete(30, root);
        display(root);
        System.out.println();
        System.out.println(size(root));
        System.out.println(maxNo(root));
        System.out.println(minNo(root));
    }

}
