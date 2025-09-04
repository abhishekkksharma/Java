package StudyStrings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Abhishek";
        String b = "Abhishek";
        System.out.println(a==b); //true 
        /*
        compare- if both the variable(a and b) are pointing to 
        the same object(Abhishek) they will return true otherwise false
        a->"Abhishek"
        b->"Abhishek"
        //output false;
        a->"Abhishek" <-b
        //true;
        */

        /*
         To create two Strings with same value we use 'new' keyword
         eg.
         String name1 = new String("Abhishek")
         String name2 = new String("Abhishek")
         */
        String name1 = new String("Abhishek");
        String name2 = new String("Abhishek");
        // to only check the values 
        System.out.println(name1==name2); //false
        System.err.println(name1.equals(name2));//true        
    }
}
