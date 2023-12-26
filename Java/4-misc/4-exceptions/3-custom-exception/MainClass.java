class MyException extends Exception{
    public MyException(String str){
        super(str);
    }

}
class MainClass{
    public static void main(String args[]){
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if (j == 0){
                throw new MyException("Not printing 0 value");
            }
        }
        catch(MyException e){
            j = 18;
            System.out.println("This is the default value " + e);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println(j);
        System.out.println("Bye");

    }
}