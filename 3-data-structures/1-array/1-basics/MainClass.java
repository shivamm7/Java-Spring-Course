class MainClass{
    public static void main(String args[]){
        
        // array initialization
        int num1[] = {1,2,3};
        num1[2] = 60;
        System.out.println(num1[2]);        

        // dynamic array initialization
        int num2[] = new int[4];
        System.out.println(num2[2]);
        
        num2[2] = 50;        
        System.out.println(num2[2]);
        
        // loop over array 1
        for(int i=0; i<4; i++){
            System.out.print(num2[i] + " ");
        }
        System.out.println();

        // loop over array 2
        for(int n : num2){
            System.out.print(n + " ");
        }
        System.out.println();

        // multi dimensional arrays
        System.out.println("multi dimensional array");
        int num3[][] = new int[5][5];
        num3[1][1] = 30;

        // loop over multidimensional array 1
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(num3[i][j] + " ");
            }
            System.out.println();
        }

        // loop over multidimensional array 2
        for(int n[] : num3){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        

        // jagged multi dimensional arrays
        System.out.println("jagged array");
        int num4[][] = new int[3][];
        num4[0] = new int[3];
        num4[1] = new int[4];
        num4[2] = new int[5];

        // loop over jagged array 1
        for(int i=0; i<num4.length; i++){
            for(int j=0; j<num4[i].length; j++){
                System.out.print(num4[i][j] + " ");
            }
            System.out.println();
        }

        // loop over jagged array 2
        for(int n[] : num4){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        
    }
}