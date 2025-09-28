package OOP.Polymorphism.Runtime;

public class Circle extends Shapes {
    //this will run when the obj of circle is being created 
    //jence it is overriding the parent method
    @Override  // this is called annotation
    //override annotation is used for check purpose
    void area(){
        System.out.println("Area is pi * r*r");
    }
}
 