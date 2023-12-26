class Mobile{
    String brand;
    int price;
    static String type; // static instance variable is shared by all objects

    public void show(){
        System.out.println(brand + " : " + price + " : " + type);
    }

    public static void show1(){
        // cannot use non static variables inside static methods
        // System.out.println(brand + " : " + price + " : " + type);
        System.out.println("In static method, " + type);
    }
}

class MainClass{
    public static void main(String args[]){

        Mobile.show1();

        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1500;

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 1000;

        Mobile.type = "smartphone"; // static variables should be accessed with class name

        m1.show();
        m2.show();

        Mobile.show1();

    }
}