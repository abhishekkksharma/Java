package StudyStrings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name =  "Abhishek Sharma";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name); // original name // strings are immutable
        System.out.println(name.length());
    }
}
