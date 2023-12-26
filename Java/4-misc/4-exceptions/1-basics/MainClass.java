
class MainClass{
    public static void main(String args[]){
        int i = 0;
        int j = 0;

        try{
            j = 18/i;
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(j);


        // multiple exceptinos
        int nums[] = new int[5];

        try{
            j = 18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println(j);
    }
}