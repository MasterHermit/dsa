class A{

     void method1(){
        System.out.println("yes");
    }
    int r=10;
}
class B extends A{
    public void method1(){
        System.out.println("No");
    }
    int r=20;
}
public class switchs {
    public static void main(String[] args) {
       A a=new B();
       a.method1();
       System.out.println(a.r);
    }
    
}
