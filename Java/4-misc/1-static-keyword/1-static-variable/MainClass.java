class Mobile{
    String brand;
    int price;
    static String type; // static instance variable is shared by all objects

    public void show(){
        System.out.println(brand + " : " + price + " : " + type);
    }
}

class MainClass{
    public static void main(String args[]){

        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1500;
        // m1.type = "smartphone";
        Mobile.type = "smartphone"; // static variables should be accessed with class name

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 1000;
        // m2.type = "smartphone";

        m1.show();
        m2.show();

        // m1.type = "mobile"; // changing static variable for one object changes it for all other objects as well as it is shared
        Mobile.type = "mobile";
        
        m1.show();
        m2.show();

    }
}