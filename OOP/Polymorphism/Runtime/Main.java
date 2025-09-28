package OOP.Polymorphism.Runtime;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle(); //upcasting
        Square square = new Square();
        
        shape.area();
        square.area();
        circle.area();
        circle.area(5); // this is calling the method from shapes(inheritence)
    }
}
