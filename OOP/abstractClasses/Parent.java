package OOP.abstractClasses;

public abstract class Parent {
    int age;
    public Parent(int age){
        this.age=age;
    }
    static void greet(){
        System.out.println("hey!");
    }
    void normal(){
        System.out.println("This is a normal method");
    }
    abstract void career();
    abstract void partner();
}
