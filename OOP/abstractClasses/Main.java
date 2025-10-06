package OOP.abstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();
        
        son.normal(); //normal method of parent class

        Daughter daughter = new Daughter(19);
        daughter.career();

        Parent.greet();
        //Parent mom = new Parent(12); // error because you can not make objects of a abstact class
    }
}
