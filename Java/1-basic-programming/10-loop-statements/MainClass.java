class MainClass{
    public static void main(String args[]){

        for(int i=0; i<10; i++){
            System.out.println("Hi " + i);
        }

        int i = 0;
        while(i < 10){
            System.out.println("Hi " + i);
            i++;   
        }

        i = 500;
        do{
            System.out.println("Hi " + i);
            i++;
        }while(i < 10);

    }
}