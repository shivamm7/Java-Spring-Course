class A{
    public void showData(){
        System.out.println("data");
    }
}

class B extends A{

    @Override
    public void showData(){
        System.out.println("new data");
    }
}
class MainClass{
    public static void main(String args[]){
        System.out.println("Hello World");
    }
}