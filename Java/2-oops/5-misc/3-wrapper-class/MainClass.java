public class MainClass{
    public static void main(String args[]){
        
        int n = 38;
        // Integer num1 = new Integer(n); //boxing
        Integer num1 = n; // auto boxing
        System.out.println(num1);

        // int num2 = num1.intValue(); // unboxing
        int num2 = num1; // auto unboxing
        System.out.println(num2);

        String s = "12";
        int num3 = Integer.parseInt(s);
        System.out.println(num3);

    }
}