abstract class Car{
    
    public abstract void drive();

    public void playMusic(){
        System.out.println("play music");
    }
}

class WagonR extends Car{
    public void drive(){
        System.out.println("drive");
    }
}

public class MainClass{
    public static void main(String args[]){
        // cannot create object of abstract class
        // Car c = new Car();
        // c.drive();
        // c.playMusic();

        WagonR w = new WagonR();
        w.drive();
    }
}