import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    
}

class MainClass{
    public static void main(String args[]){

        List<String> names = Arrays.asList("Ram", "Shyam");
        
        List<Student> students = new ArrayList<>();
        // for(String name : names){
        //     students.add(new Student(name));
        // }

        // students = names.stream()
        //                 .map(name -> new Student(name))
        //                 .toList();

        students = names.stream()
                        .map(Student::new)
                        .toList();

        System.out.println(students);

    }
}