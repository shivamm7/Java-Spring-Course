import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class MainClass{
    public static void main(String args[]){
        List<Integer> nums = new ArrayList<>(1000000);
        
        Random ran = new Random();

        for(int i=0; i<1000000; i++){
            int n = ran.nextInt(100);
            nums.add(n);
        }

        long s = System.currentTimeMillis();
        int sum1 = nums.stream()
                    .map(i -> i*2)
                    .reduce(0, (c, e) -> c+e);
        
                    System.out.println(System.currentTimeMillis() - s);
        s = System.currentTimeMillis();

        int sum2 = nums.stream()
                    .map(i -> i*2)
                    .mapToInt(i -> i)
                    .sum();

        System.out.println(System.currentTimeMillis() - s);
        s = System.currentTimeMillis();
        
        int sum3 = nums.parallelStream()
                    .map(i -> i*2)
                    .mapToInt(i -> i)
                    .sum();
        System.out.println(System.currentTimeMillis() - s);

        System.out.println(sum1 + " " + sum2 + " " + sum3);

        // System.out.println(nums);
    }
}