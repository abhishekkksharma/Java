package OOP.Polymorphism.Runtime;

public class Circle extends Shapes {
    // checks if the function or method is overriding or not
    @Override // this is called annotation
    void area(){
        System.out.println("Area is pi * r*r");
    }
}
