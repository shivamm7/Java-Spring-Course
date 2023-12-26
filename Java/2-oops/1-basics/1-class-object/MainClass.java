class Calaculator{

    int a;

    // methods
    public int add(int num1, int num2){

        int result = num1 + num2;
        return result;
        
    }
}

class MainClass{
    public static void main(String args[]){

        int num1 = 4;
        int num2 = 5;

        Calaculator calc = new Calaculator();

        int result = calc.add(num1, num2);
        System.out.println(result);

    }
}