package OOP.Interfaces.ExtendDemo;

public interface A {
    // static interface methods must have a body
    // can call via interface name; 
    static void hi(){
        System.out.println("Hey, from static method from A");
    }
    void fun();
} 