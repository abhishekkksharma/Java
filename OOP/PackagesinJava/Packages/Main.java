package OOP.PackagesinJava.Packages;

public class Main {
    public static void main(String[] args) {
        Human abhishek =new Human(20, "Abhishek", 1000, false);
        Human rahul =new Human(20, "Rahul", 1000, false);
        Human arpit = new Human(12, "Arpit", 10000, false);
    
        System.out.println(abhishek.name);
        System.out.println(Human.population);
        System.out.println(rahul.name);
        System.out.println(Human.population);
        System.out.println(arpit.name);
        // System.out.println(arpit.population); // Not a good practice 
        System.out.println(Human.population);
        /*
         Static vairbales can even be used without creting objects 
         like "Human.population"
         -it belongs to the class not the object,therefore it can be used 
         without using or creating any object
        */

    }
    // this is not dependent on objects
    static void fun(){
        // greeting(); 
        // you can not use this  because it in does not depend on instance
        // but the function you are using it in does not depend on instance

        //[NOTE]- you can not use non static stuff without referencing 
        //their instances in a static context

        //This is how you can use the freeting();
        Main obj = new Main();
        obj.greeting();
    }
    // we know that something which is not static, belongs to an object
    void greeting(){
        // fun(); //this will work
        System.out.println("Hello");
    }
}
