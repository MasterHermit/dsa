import java.util.*;

public class AdjancecyList {
    static void addEdge(ArrayList<ArrayList<Integer>> al,int i,int j ){
        al.get(i).add(j);
        al.get(j).add(i);

    }
    static void printGraph(ArrayList<ArrayList<Integer>> al){
        for(int i=0;i<al.size();i++){
            for(int j=0;j<al.get(i).size();j++){
                System.out.print(al.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    static void bfs(ArrayList<ArrayList<Integer>> al,int v,int s){
        boolean[] arr=new boolean[v+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        arr[s]=true;
        while(q.isEmpty() == false){
            int u=q.poll();
            System.out.print(u+" ");
            for(int i:al.get(u)){
                if(arr[i]==false){
                    q.add(i);
                    arr[i]=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++)
            al.add(new ArrayList<Integer>());

            addEdge(al,0,1);
            addEdge(al,0,2);
            addEdge(al,1,2);
            addEdge(al,1,3);
            printGraph(al);
            int s=0;
            bfs(al, v, s);
        
            
    }
}