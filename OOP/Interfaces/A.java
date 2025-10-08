package OOP.Interfaces;

public class A {
    public interface InnerNestedInterfaces {
        boolean isOdd(int num);
    }
}
class B implements A.InnerNestedInterfaces {

    @Override
    public boolean isOdd(int num) {
        return (num & 1)==1;
    }
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(0));
    }
}
