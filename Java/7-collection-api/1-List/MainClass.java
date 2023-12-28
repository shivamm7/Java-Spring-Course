import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class MainClass{
    public static void main(String args[]){
        
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        for(int i : nums){
            System.out.println(i);
        }

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(30));
    }
}