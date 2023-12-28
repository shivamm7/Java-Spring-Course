class Counter{
    int count;
    public synchronized void inc(){
        count++;
    }
}
class MainClass{
    public static void main(String args[]) throws InterruptedException{
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for(int i = 0; i < 10000; i++){
                c.inc();
            }
        };
        Runnable obj2 = () -> {
            for(int i = 0; i < 10000; i++){
                c.inc();
            }
            
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        
        t1.join();
        t2.join();

        System.out.println(c.count);

    }
}