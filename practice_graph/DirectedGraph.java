import java.util.*;
public class DirectedGraph {
    static void addEdge(ArrayList<ArrayList<Integer>> al,int u,int v){
        al.get(u).add(v);
    }
    static void printGraph(ArrayList<ArrayList<Integer>> al) {
        for (int i = 0; i < al.size(); i++) {
            for (int j = 0; j < al.get(i).size(); j++) {
                System.out.print(al.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    static void topoSort(ArrayList<ArrayList<Integer>> al,boolean[] arr,int s,Stack<Integer> st){
        arr[s]=true;
        for(int u: al.get(s)){
            if(arr[u]==false){
                topoSort(al,arr,u,st);
            }
        }
        st.push(s);
    }
    static void topo(ArrayList<ArrayList<Integer>> al,int v){
        boolean[] arr = new boolean[v];
        Stack<Integer> st= new Stack<Integer>();
        for(int i=0;i<v;i++){
            if(arr[i]==false){
                topoSort(al,arr,i,st);
            }
        }
        int count=0;
        while(!st.isEmpty()){
            System.out.println(st.pop());
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<ArrayList<Integer>>al=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++) al.add(new ArrayList<Integer>());

        addEdge(al,0,1);
        addEdge(al,1,3);
        addEdge(al,3,4);
        addEdge(al,2,3);
        addEdge(al,2,4);
        printGraph(al);
        topo(al, V);
        
    }
    
}
