import java.util.*;

public class AdjancecyList {
    static void addEdge(ArrayList<ArrayList<Integer>> al, int i, int j) {
        al.get(i).add(j);
        al.get(j).add(i);

    }

    static void printGraph(ArrayList<ArrayList<Integer>> al) {
        for (int i = 0; i < al.size(); i++) {
            for (int j = 0; j < al.get(i).size(); j++) {
                System.out.print(al.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    static void bfs(ArrayList<ArrayList<Integer>> al, int s, boolean[] arr) {

        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        arr[s] = true;
        while (q.isEmpty() == false) {
            int u = q.poll();
            System.out.print(u + " ");
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
        for (int s = 0; s < v; s++) {
            if (arr[s] == false) {
                bfs(al, s, arr);
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

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++)
            al.add(new ArrayList<Integer>());

        addEdge(al, 0, 1);
        addEdge(al, 0, 2);
        addEdge(al, 1, 3);
        addEdge(al, 2, 3);
        addEdge(al, 3, 4);

        addEdge(al, 1, 4);
        // printGraph(al);
        int s = 0;
        preBfs(al, v);
        System.out.println();
        preDfs(al, v);

    }
}