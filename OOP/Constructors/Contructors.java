package OOP.Constructors;

public class Contructors {
    public static void main(String[] args) {
        // not a good practice for constructor:
        // Student Student1 = new Student();
        // System.out.println(Student1.roll);
        // System.out.println(Student1.name);
        // System.out.println(Student1.marks);

        // Student1.roll = 1;
        // Student1.name = "Abhishek";
        // Student1.marks = 80.00f;
        
        // System.out.println(Student1.roll);
        // System.out.println(Student1.name);
        // System.out.println(Student1.marks);
        Student Student1 = new Student(1, "Abhishek", 8.7f);
        System.out.println(Student1.roll);
        System.out.println(Student1.name);
        System.out.println(Student1.marks);
    }
}

class Student{
    int roll;
    String name;
    float marks;
    //parameterized constructor:
    Student(int r, String n, float m){
        roll=r;
        name=n;
        marks=m;
    }
}
