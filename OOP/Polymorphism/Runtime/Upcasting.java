package OOP.Polymorphism.Runtime;

class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class method");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Parent obj = new Child(); // Upcasting
        obj.show(); // Runtime polymorphism → Child's method
    }
}
