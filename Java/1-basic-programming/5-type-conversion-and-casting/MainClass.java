class MainClass{
    public static void main(String args[]){

        byte b = 127;
        int a = 265;
        // b = a;  // error data loss
        a = b;
        System.out.println(a);

        a = 12; // value outside byte range will not work -> will do modulo with range
        b = (byte)a;    // casting
        System.out.println(b);

        float f = 56.56f;
        int af = (int)f;
        System.out.println(af);

        byte num1 = 30;
        byte num2 = 10;
        int result = num1 * num2; // type promotion
        System.out.println(result);

        int num3 = 30;
        result = num1 * num3;
        System.out.println(result);

    }
}