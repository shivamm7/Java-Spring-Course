class Human{
    private int age = 11;
    private String name = "tensor";

    // getter
    public int getAge(){
        return age;
    }

    // setter
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class MainClass{
    public static void main(String args[]){
        Human h1 = new Human();
        h1.setAge(12);
        h1.setName("board");

        System.out.println(h1.getAge() + " : " + h1.getName());


    }
}