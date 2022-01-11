import java.util.*;
class MyHash{
  int[] a;
    int cap;
    int size;
    MyHash(int k,int[] a){
        cap=k;
        size=0;
        this.a=a;
       
        for(int i=0;i<cap;i++){
            a[i]=-1;
        }
    }
        int hash(int key){
            return key%cap;

        }

        boolean search(int key){
            int h=hash(key);
            int i=h;
            while(a[i]!=-1){
                if(a[i]==key) return true;
                i=(i+1)%cap;
                if(i==h) return false;
            }
            return false;
        }
        boolean insert(int key){
            if(size==cap) return false;
            int i=hash(key);
            while(a[i]!=-1 && a[i]!=-2 && a[i]!=key){
                i=(i+1)%cap;
            }
            if(a[i]==key) return false;
            else{
                a[i]=key;
                size++;
                return true;
            }
        }
        boolean erase(int key){
            int h=hash(key);
            int i=h;
            while(a[i]!=-1){
                if(a[i]==key) a[i]=-2;
                i=(i+1)%cap;
                if(i==h) return false;

            }
            return false;
        }

 

}
public class ImplementationOfOpenAddressing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int[] a=new int[key];
        MyHash mh=new MyHash(key,a);
        mh.insert(41);
        mh.insert(42);
        mh.insert(51);
        if(mh.search(42)==true)
        {
            System.out.println("yes");
        }
        else System.out.println("No");
        mh.erase(42);
        if(mh.search(42)==true) System.out.println("Yes");
        else System.out.println("No");
        
    }
}