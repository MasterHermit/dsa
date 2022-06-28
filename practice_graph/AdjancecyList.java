import java.util.*;

public class AdjancecyList {

    static void addEdge(ArrayList<ArrayList<Integer>> al, int i, int j) {
        al.get(i).add(j);
        al.get(j).add(i);

    }

    static void printGraph(ArrayList<ArrayList<Integer>> al, HashSet<Integer> h) {

        for (int i = 0; i < al.size(); i++) {
            for (int j = 0; j < al.get(i).size(); j++) {
                System.out.print(al.get(i).get(j) + " ");
                h.add(al.get(i).get(j));
            }
            System.out.println();

        }
        System.out.println(h.size());
    }

    static void bfs(ArrayList<ArrayList<Integer>> al, int s, boolean[] arr) {

        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        arr[s] = true;

        while (q.isEmpty() == false) {
            int u = q.poll();

            // System.out.print(u + " ");
            for (int i : al.get(u)) {
                if (arr[i] == false) {
                    q.add(i);
                    arr[i] = true;

                }

            }
        }

    }

    static void preBfs(ArrayList<ArrayList<Integer>> al, int v) {
        boolean[] arr = new boolean[v];
        int no = Integer.MIN_VALUE;
        int x = 3;
        for (int s = 0; s < v; s++) {
            if (arr[s] == false) {
                bfs(al, s, arr);
                // if(count<=x){
                // no=Math.max(no,count);
                // System.out.println(no + " ");
                // }
            }
        }
    }

    static void dfs(ArrayList<ArrayList<Integer>> al, int s, boolean[] arr) {
        arr[s] = true;
        System.out.println(s);
        for (int u : al.get(s)) {
            if (arr[u] == false) {
                dfs(al, u, arr);
            }
        }
    }

    static void preDfs(ArrayList<ArrayList<Integer>> al, int v) {
        boolean[] arr = new boolean[v];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == false) {
                bfs(al, i, arr);

            }

        }

    }

    static boolean checkCycle(ArrayList<ArrayList<Integer>> al, boolean[] arr, int s, int p) {
        arr[s] = true;
        for (int u : al.get(s)) {
            if (arr[u] == false) {
                if (checkCycle(al, arr, u, s))
                    return true;
            } else if (u != p) {
                return true;
            }
        }
        return false;

    }

    static boolean isCycle(ArrayList<ArrayList<Integer>> al, int v) {
        boolean[] arr = new boolean[v];
        for (int i = 0; i < v; i++)
            if (arr[i] == false)
                if (checkCycle(al, arr, i, -1) == true)
                    return true;
        return false;
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++)
            al.add(new ArrayList<Integer>());

        // addEdge(al,0,1);
        // addEdge(al,0,2);
        // addEdge(al,0,3);
        // addEdge(al,1,4);
        // addEdge(al,1,5);
        // addEdge(al,4,2);
        // addEdge(al,3,5);
        // addEdge(al,2,5);
        // addEdge(al,5,1);
        addEdge(al, 1, 2);
        addEdge(al, 0, 1);
        addEdge(al, 2, 3);
        HashSet<Integer> h = new HashSet<Integer>();
        // printGraph(al,h);

        // int s = 0;
        preBfs(al, v);
        // System.out.println();
        // preDfs(al, v);
        // System.out.println(isCycle(al,v));

    }
}