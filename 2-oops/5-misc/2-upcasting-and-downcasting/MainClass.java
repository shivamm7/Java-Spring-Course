class A{
    public void show1(){
        System.out.println("In A show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In B show");
    }
}
public class MainClass{
    public static void main(String args[]){
        A a = (A) new B(); // upcasting: from object of type child we are going to object of type parent
        a.show1();

        A aa = new B(); // object of B reference of A
        // aa.show2(); // does not work
        B bb = (B) a;
        bb.show2();

        // B b = new A(); // does not work

    }
}