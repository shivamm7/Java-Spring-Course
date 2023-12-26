
@FunctionalInterface
interface A{
    void show();
    // void run();
}

// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     }
// }

class MainClass{
    public static void main(String args[]){
        // anonymous inner class
        A obj = new A(){
            public void show(){
                System.err.println("in show");
            }
        };
        obj.show();
    }
}