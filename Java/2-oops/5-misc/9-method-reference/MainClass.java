import java.util.Arrays;
import java.util.List;

class MainClass{
    public static void main(String args[]){
        List<String> names = Arrays.asList("Ram", "Shyam");

        // List<String> Names = names.stream()
        //                         .map(name -> name.toUpperCase())
        //                         .toList();
        
        // System.out.println(Names);
        
        List<String> Names = names.stream()
                        .map(String::toUpperCase)
                        .toList();
        System.out.println(Names);

    }
}