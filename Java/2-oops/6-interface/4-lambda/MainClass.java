
@FunctionalInterface
interface A{
    int add(int i, int j);
}

class MainClass{
    public static void main(String args[]){
        // lambda function directly assigned to the interface function
        A obj = (int i, int j) -> {
                return i+j;
            };

        int ans = obj.add(5, 6);
        System.out.println(ans);
    }
}