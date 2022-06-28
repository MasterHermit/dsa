import java.util.*;

public class GfgGeekMusk {
   public static int n=Integer.MIN_VALUE;

  static void graph(ArrayList<ArrayList<Integer>> al,int a ,int b){
      al.get(a).add(b);
      al.get(b).add(a);
  }



    static void prebfs(ArrayList<ArrayList<Integer>> con,boolean[] vis,int x){
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                bfs(con,vis,x,i);
            }

        }
    }

    static void bfs(ArrayList<ArrayList<Integer>> con,boolean[] vis,int x,int s){
         vis[s]=true;
         Queue<Integer> q = new LinkedList<>();
         q.add(s);
         int c=1;
        
         while(!q.isEmpty()){
             int cur=q.poll();
             for(int i:con.get(cur)){
                 if(vis[i]==false){
                     q.add(i);
                     vis[i]=true;
                     c++;
                 }
             }
         }
         if(c<=x){
             n=Math.max(n,c);
             System.out.println(c+" "+n);

         }
    }



    

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> con = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(0,0);
        a1.add(1,1);
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(0,1);
        a2.add(1,2);
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(0,2);
        a3.add(1,3);
        con.add(a1);
        con.add(a2);
        con.add(a3);

        HashSet<Integer> hs = new HashSet<Integer>();


        for (int i = 0; i < con.size(); i++) {
            for (int j = 0; j < con.get(i).size(); j++) {
                hs.add(con.get(i).get(j));
            }
        }
        int v=hs.size();
        
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++)
            al.add(new ArrayList<Integer>());

            for(int i=0;i<con.size();i++){
                int a=con.get(i).get(0);
                int b=con.get(i).get(1);
                graph(al, a, b);
            }


       boolean[] vis=new boolean[v];

       prebfs(al,vis,3);
   
       
    }
}
