// class A implements Runnable{
//     public void run(){
//         for(int i = 0; i <= 10; i++){
//             System.out.println("hello");
//         }
//     }
// }
// class B implements Runnable{
//     public void run(){
//         for(int i = 0; i <= 10; i++){
//             System.out.println("world");
//         }
//     }
// }
class MainClass{
    public static void main(String args[]){
        Runnable obj1 = () -> {
            for(int i = 0; i <= 10; i++){
                System.out.println("hello");
            }
        };
        Runnable obj2 = () -> {
            for(int i = 0; i <= 10; i++){
                System.out.println("world");
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}