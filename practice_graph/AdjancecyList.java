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
        
            
    }
}