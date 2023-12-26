class MainClass{
    public static void main(String args[]){
        
        int x = 28;

        if(x > 10 && x <= 20){
            System.out.println("Hello");
        }
        else{
            System.out.println("Bye");
        }


        x = 8;
        int y = 9;
        int z = 10;

        if(x > y && x > z){
            System.out.println(x);
        }
        else if(y > z){
            System.out.println(y);
        }
        else{
            System.out.println(z);
        }

        // ternary operators
        int n = 5;
        int result = n%2 == 0 ? 0 : 1;
        System.out.println(result);

        // switch
        n = 3;
        switch (n){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Enter a valid number");
        }
    }
}