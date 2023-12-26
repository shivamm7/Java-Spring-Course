class A{
    public void first() throws Exception{
        int i = 0;
        int j = 0;
        j = 18/i;
    }
    public void second() throws Exception{
        int a[] = new int[5];
        a[5] = 30;
    }
}
class MainClass{
    public static void main(String args[]){
        
        A obj = new A();

        try{
            obj.first();
            obj.second();
        }
        catch(ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Bye");

    }
}