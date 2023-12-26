class A{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int n){
        super();
        System.out.println("In A " + n);
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }

    public B(int n){
        super(n);
        System.out.println("In B " + n);
    }
}

class MainClass{
    public static void main(String args[]){
        B b1 = new B();
        B b2 = new B(5);
    }
}