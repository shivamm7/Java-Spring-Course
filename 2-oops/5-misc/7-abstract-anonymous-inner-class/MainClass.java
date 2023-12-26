abstract class A{
	public abstract void show();
}

public class MainClass{
    public static void main(String args[]){
        A obj = new A(){
            public void show(){
                System.out.println("in anon show");
            }
        };

        obj.show();
    }
}