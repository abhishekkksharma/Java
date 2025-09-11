package OOP.Constructors;

public class CopyConstructor {
    public static void main(String[] args) {
        Student abhishek = new Student(1,"Abhishek",88.8f);
        System.out.println(abhishek.roll);
        System.out.println(abhishek.name);
        System.out.println(abhishek.marks);
        System.out.println();
        
        Student aman = new Student(abhishek);
        System.out.println(aman.roll);
        System.out.println(aman.name);
        System.out.println(aman.marks);
        System.out.println();
        
        //calling another constructor with a constructor:
        Student random = new Student();
        System.out.println(random.roll);
        System.out.println(random.name);
        System.out.println(random.marks);
        System.out.println();

        Student one = new Student();
        Student two = one;
        // the Student two referes to the one (points to one) 
        one.name = "something something";
        System.out.println(two.name);


    }
}
class Student{
    int roll;
    String name;
    float marks;
    // default constructor
    // Student(){
    //     roll=999;
    //     name="Default";
    //     marks= 99.9f;
    // }
    //parameterized constructor:
    Student(int roll, String name, float marks){
        this.roll=roll;
        this.name=name;
        this.marks= marks;
    }
    //copy contrsuctor 
    Student (Student other){
        this.roll = other.roll;
        this.name = other.name;
        this.marks = other.marks;
    }
    // this is how you call another constructor in a constructor
    Student (){
        this(99,"default person",100.0f);
    }
    // the this key refers to the current object values passed 

}

