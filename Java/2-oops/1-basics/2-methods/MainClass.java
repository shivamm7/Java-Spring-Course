class Computer{

    public void playMusic(){
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost){

        if(cost >= 10)
            return "Pen";
        
        return "Nothing";
    }

}

class MainClass{
    public static void main(String args[]){
        
        Computer comp = new Computer();

        comp.playMusic();
        String str = comp.getMeAPen(2);
        System.out.println(str);

    }
}