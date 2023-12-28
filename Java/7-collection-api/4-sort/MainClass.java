import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
}

class MainClass{
    public static void main(String args[]){
        List<Integer> nums = new ArrayList<>();
        nums.add(44);
        nums.add(53);
        nums.add(32);
        nums.add(11);

        Comparator com = new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                int a_last = a %10;
                int b_last = b%10;
                
                if(a_last <= b_last){
                    return -1;
                }
                return 1;
            }
        };

        Collections.sort(nums, com);

        System.out.println(nums);

        Comparator com_st = new Comparator<Student>() {
            public int compare(Student a, Student b){
    
                if(a.age <= b.age){
                    return -1;
                }
                return 1;
            }
        };

        List<Student> st = new ArrayList<>();
        st.add(new Student(22, "Ram"));
        st.add(new Student(21, "Shyam"));

        Collections.sort(st, com_st);

        for(Student s : st){
            System.out.println(s);
        }
    }
}