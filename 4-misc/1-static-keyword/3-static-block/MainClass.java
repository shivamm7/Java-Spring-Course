class Mobile{
    String brand;
    int price;
    static String type; // static instance variable is shared by all objects

    // static block
    // static blocks run when class loads, which happens only once when first object is created or first time class is accessed with stuff like static methods and variables.
    static{
        type = "default";
        System.out.println("In static block");
    }

    // constructor
    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

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

        System.out.println("Starting code");
        // Mobile.show1();
        // Mobile.type = "smart";

        System.out.println("Creating m1");
        Mobile m1 = new Mobile();
        System.out.println("m1 created");

        Mobile.show1();

        System.out.println("Creating m2");
        Mobile m2 = new Mobile();
        System.out.println("m2 created");

        Mobile.show1();

    }
}