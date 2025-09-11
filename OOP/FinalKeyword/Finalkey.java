package OOP.FinalKeyword;

public class Finalkey {
    public static void main(String[] args) {
        final int a =10;
        System.out.println(a);
        // a=10; 
        /*
        not allowed since final keyword 
        ensures that the data does not to be changed further

        - while using final make sure to initialize the value while creation
         because it is not mutable.
        - when non primitive data type is used it referece to the meomary refrence 
          not the value , so the value can be changed however the reference is non mutable.
         */

        /*
         when a non primitve is a final, you cannot reasssign it.
         */
        final A abhishek = new A("abhishek");
        abhishek.name="Sharma";
        // abhishek = new A("null"); // error
        // A obj;
        // for (int i = 0; i < 1000000; i++) {
        //     //when more objects are created that may take more space. it is destroyed 
        //     obj = new A("random name");
        // }
    }
}
class A {
    final int num = 10;
    String name; 
    public A(String name){
        System.out.println("object created");
        this.name=name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}