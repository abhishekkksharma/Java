package Hashing;
import java.util.*;

public class Hashmapping {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        // string-key , integer - value
        map.put("Kunal", 89);
        map.put("Karan", 99);
        map.put("Rahul", 94);
        System.out.println(map);
        // elements unordered in the map(not the same sequence of adding)
        System.out.println(map.get("Kunal")); //89
        System.out.println(map.get("Abhishek")); //null
        if(map.containsKey("Kunal")){
            System.out.println("The key is present in the map");
        }else{
            System.out.println("Key is not present in the map");
        }
        System.out.println(map.getOrDefault("Abhishek",1)); // 1  
        System.out.println("Size: " + map.size()); // size of map
    }
}
