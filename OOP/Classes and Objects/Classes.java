public class Classes {
    public static void main(String[] args) {
        Student Student1 = new Student();
        System.out.println(Student1.roll);
        System.out.println(Student1.name);
        System.out.println(Student1.marks);

        Student1.roll = 1;
        Student1.name = "Abhishek";
        Student1.marks = 80.00f;
        
        System.out.println(Student1.roll);
        System.out.println(Student1.name);
        System.out.println(Student1.marks);
    }
}

class Student{
    int roll;
    String name;
    float marks;
}
