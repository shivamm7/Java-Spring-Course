import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class MainClass{
    public static void main(String args[]){
        List<String> names = Arrays.asList("Ram", "Shyam");

        Optional<String> name = names.stream()
                        .filter(str -> str.contains("x"))
                        .findFirst();
        
        System.out.println(name.orElse("Not Found"));            
    
    }
}