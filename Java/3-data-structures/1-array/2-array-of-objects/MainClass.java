class Student{
    int rollno;
    String name;
    int marks;
}

class MainClass{
    public static void main(String args[]){
        
        Student students[] = new Student[2]; // here object is not created but an array is created

        Student s1 = new Student(); // here object is created
        s1.rollno = 1;
        s1.name = "A";
        s1.marks = 50;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "B";
        s2.marks = 80;

        students[0] = s1;
        students[1] = s2;

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].name);
        }

        for(Student s : students){
            System.out.println(s.name + " : " + s.marks);
        }
    }
}