class A{
    // default access modifier
    int marks = 6;
}

class MainClass{
    public static void main(String args[]){

        A a = new A();
        System.out.println(a.marks);
    }
}