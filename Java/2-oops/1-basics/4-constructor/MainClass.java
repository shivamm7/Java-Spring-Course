class Human{
    private int age;
    private String name;

    public Human(){
        this.age = 13;
        this.name = "";
    }

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}

class MainClass{
    public static void main(String args[]){
        Human h1 = new Human();
        System.out.println(h1.getAge());
        
        Human h2 = new Human(15, "board");
        System.out.println(h2.getAge());

    }
}