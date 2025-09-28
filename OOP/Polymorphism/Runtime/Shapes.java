package OOP.Polymorphism.Runtime;

public class Shapes {
    void area(){
        System.out.println("I am in shapes");
    }

    void area(int side){
        System.out.println("Area is: "+side*side);
    }
    //FINAL:
    //this makes sure that function should not be overriden
    //prevents overriding
    // also can be used to prevent a class from inherited
    // final void area(){
    //     System.out.println("I am in shapes");
    // }
}
