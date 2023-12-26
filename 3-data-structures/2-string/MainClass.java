class MainClass{
    public static void main(String args[]){

        String name = new String("tensor");

        System.out.println("hello " + name);
        System.out.println("1: " + name.charAt(1));
        System.out.println(name.concat("board"));

        name = "tensor";
        name = name + "board"; // here new string opbject is created
        System.out.println(name);

        // here there are 2 references but there is only 1 object
        String s1 = "Tensor";
        String s2 = "Tensor";
        

    }
}