import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class MainClass{
    public static void main(String args[]){
        List<Integer> nums = Arrays.asList(1,2,3,4);

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        // s2.forEach(n -> System.out.println(n));
        Stream<Integer> s3 = s2.map(n -> n*2);
        s3.forEach(n -> System.out.println(n));

        int result = nums.stream()
            .filter(n -> n%2 == 0)
            .map(n -> n*2)
            .reduce(0, (c,e) -> c+e);
        System.out.println(result);

        int sum = 0;
        for(int n : nums){
            if(n % 2 == 0){
                n *= 2;
                sum += n;
            }
        }
        // System.out.println(sum);
        System.out.println(nums);

    }
}