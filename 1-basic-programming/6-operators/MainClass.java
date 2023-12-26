class MainClass{
    public static void main(String args[]){

        int num1 = 50;
        int num2 = 30;
        int result;

        result = num1 + num2;
        System.out.println(result);
        
        result = num1 - num2;
        System.out.println(result);
        
        result = num1 * num2;
        System.out.println(result);
        
        result = num1 / num2;
        System.out.println(result);
        
        result = num1 % num2;
        System.out.println(result);
        

        num1 += 10;
        System.out.println(num1);

        num1 *= 20;
        System.out.println(num1);


        num1++;
        System.out.println(num1);
        num1--;
        System.out.println(num1);

        ++num1;
        System.out.println(num1);

        int num = 10;
        result = ++num;
        System.out.println("Pre-increment");
        System.out.println(result);
        System.out.println(num);

        num = 10;
        result = num++;
        System.out.println("Post-increment");
        System.out.println(result);
        System.out.println(num);


    }
}