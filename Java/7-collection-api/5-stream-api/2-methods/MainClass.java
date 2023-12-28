import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class MainClass{
    public static void main(String args[]){
        List<Integer> nums = Arrays.asList(1,2,3,4);

        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer n){
                if(n%2 == 0){
                    return true;
                }
                return false;
            }
        };

        Function<Integer, Integer> fun = new Function<Integer, Integer>() {
            public Integer apply(Integer n){
                return n*2;
            }
        };

        int result = nums.stream()
            .filter(p)  // p = n -> n%2==0
            .map(fun) // n -> n*2
            .reduce(0, (c,e) -> c+e);
        System.out.println(result);

        Stream<Integer> sortedValues = nums.stream()
                        .filter(p)
                        .sorted();
        sortedValues.forEach(n -> System.out.println(n));

        System.out.println(nums);

    }
}