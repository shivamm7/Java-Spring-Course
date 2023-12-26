// final - variable, method, class

final class Calc{
    public void show(){
        System.out.println("Calc show");
    }
    public void add(int a, int b){
        System.out.println(a + b);
    }
}

// not possible
// class AdvCalc extends Calc{

// }

class AdvCalc{
    public void show(){
        System.out.println("Calc show");
    }
    final public void add(int a, int b){
        System.out.println(a + b);
    }
}

class VeryAdvCalc{
    // not possible
    // public void add(int a, int b){
    //     System.out.println(a + b);
    // }
}

class MainClass{
    public static void main(String args[]){
        final double pi = 3.14;
        // pi = 3.1; // not possible

        Calc c = new Calc();
        c.show();
        c.add(3, 4);

    }
}