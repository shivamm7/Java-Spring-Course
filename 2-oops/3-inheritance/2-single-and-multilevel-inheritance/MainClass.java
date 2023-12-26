class MainClass{
    public static void main(String args[]){
    
        VeryAdvCalc c = new VeryAdvCalc();
        int r1 = c.add(10, 5);
        int r2 = c.sub(10, 5);
        int r3 = c.mul(10, 5);
        int r4 = c.div(10, 5);


        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    
    }
}