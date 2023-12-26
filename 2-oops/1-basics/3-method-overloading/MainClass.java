class Calculator{

    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2){
        return n1 + n2;
    }

    // does not work as return type does not matter
    // public double add(int n1, int n2){
    //     return n1 + n2;
    // }
}

class MainClass{
    public static void main(String args[]){

        Calculator calc = new Calculator();
        int result = calc.add(3, 4);
        System.out.println(result);

        result = calc.add(3, 4, 5);
        System.out.println(result);

        double res = calc.add(4.5, 5);
        System.out.println(res);

    }
}