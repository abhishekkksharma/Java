package OOP.Interfaces.ExtendDemo;

public class Main implements B{
    //since you are implementing B , you need to implement both methods of B- greet() and A>B fun()
    @Override
    public void greet() {
        
    }

    @Override
    public void fun() {
        
    }

    public static void main(String[] args) {
        A.hi();
    }
    
}
