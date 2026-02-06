package OOP.Interfaces.FunctionalInterfaces;
// this is a functional interface with a single abstract method
interface ABC {
    void display(int a);
}

// Using anonymous class to implement the interface
//  what is an anonymous class?
// An anonymous class is a class without a name that is defined and instantiated in a single expression.
public class AnonymousInterface {
    public static void main(String[] args) {
        // this is an anonymous class implementing the ABC interface
        // there is no class name, and we provide the implementation of the display method directly
        ABC obj = new ABC() {
            @Override
            public void display(int a) {
                System.out.println("Display method implemented using anonymous class with value: " + a);
            }
        };
        ABC obj2 = (a) -> System.out.println("Display method implemented using lambda expression with value: " + a);

        obj.display(10);
        obj2.display(20);
    }
}
