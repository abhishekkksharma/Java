package OOP.PackagesinJava.Packages;

public class Human {
    int age;
    String name;
    int salary;
    boolean maried;
    static long population;
    
    public Human(int age, String name,int salary, boolean maried){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.maried=maried;
        Human.population +=1;
    }
}
