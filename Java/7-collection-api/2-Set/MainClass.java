import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

class MainClass{
    public static void main(String args[]){

        Set<Integer> nums = new HashSet<Integer>();
        nums.add(10);
        nums.add(10);
        nums.add(20);
        nums.add(20);

        for(int i : nums){
            System.out.println(i);
        }

        Iterator<Integer> it = nums.iterator();

        while(it.hasNext())
            System.out.println(it.next());

    }
}