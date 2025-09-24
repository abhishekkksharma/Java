package OOP.Polymorphism.Runtime;
//compile time polymorphism 

//function overloading/constructor overloading
public class Numbers {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Numbers num = new Numbers();
        System.out.println(num.sum(1, 2));
        System.out.println(num.sum(1, 2,3));
    }
}
