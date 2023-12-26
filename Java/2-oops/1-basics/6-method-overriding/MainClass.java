class A{
    public void show(){
        System.out.println("In A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}
class MainClass{
    public static void main(String args[]){
        A a = new A();
        a.show();
        
        B b = new B();
        b.show();
    }
}