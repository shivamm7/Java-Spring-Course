interface A{

    int age = 22;
    String area = "45";

    // by default public abstract
    void show();
    void config();
}

interface C extends A{
    void run();
}

interface D extends C{
    void walk();
}

class B implements D{

    // compulsory to define methods
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("in run");
    }
    public void walk(){
        System.out.println("in walk");
    }
}

class MainClass{
    public static void main(String args[]){

        A obj;
        obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.age);
    }
}