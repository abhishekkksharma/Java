package OOP.Constructors;

public class Wrappers {
    public static void main(String[] args) {
        /* 
        The int is a primtive data type, such that it is stored in 
        stack memory and is not an object. 
        */
        int a = 10;
        System.out.println(a);
        /*
        However this is how you create 
        int as object.
         */
        Integer num = 45;
        System.out.println(num);
        // now since it is an object you can access many inbuilt functions like num.{functions..};   
        System.out.println(num.equals(a));     
    }
}
