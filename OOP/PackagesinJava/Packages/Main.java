package OOP.PackagesinJava.Packages;

public class Main {
    public static void main(String[] args) {
        Human abhishek =new Human(20, "Abhishek", 1000, false);
        Human rahul =new Human(20, "Rahul", 1000, false);

        System.out.println(abhishek.name);
        System.out.println(Human.population);
        System.out.println(rahul.name);
        System.out.println(Human.population);
    }
}
