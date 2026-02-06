package DSAClass.OOP;

class Abc{
    int a=10;
    static class Xyz {
        int y=20;        
    }
    class Pqr{
        int z=30;
    }
}

public class nestedClasses {
    public static void main(String[] args) {

        Abc obj1 = new Abc();
        Abc.Xyz obj2 = new Abc.Xyz();
        Abc.Pqr obj3 = obj1.new Pqr();

        System.out.println(obj1.a);   
        System.out.println(obj2.y);   
        System.out.println(obj3.z);   
    }
}