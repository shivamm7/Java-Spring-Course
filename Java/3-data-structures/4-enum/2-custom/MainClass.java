enum Laptop{
    Macbook(2000), XPS, Surface(1500), Thinkpad(1800);
    
    private int price;

    private Laptop() {
        price = -1;
    }

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

class MainClass{
    public static void main(String args[]){
        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " " + lap.getPrice());

        for(Laptop curr : Laptop.values()){
            System.out.println(curr + " " + curr.getPrice());    
        }
    }
}