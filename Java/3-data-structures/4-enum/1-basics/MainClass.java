
enum Status{

    // objects of Status
    Running, Failed, Pending, Success;
}

class MainClass{
    public static void main(String args[]){
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] ss = s.values();
        for(Status curr_s : ss){
            System.out.println(curr_s);
        }

        Status t = Status.Pending;

        switch(t){
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");   
        }

        
    }
}