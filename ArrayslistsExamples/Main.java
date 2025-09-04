package ArrayslistsExamples;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list.contains(10));
        System.out.println(list);
        list.set(0, 99);
        // for (Integer integer : list) {
        //     System.out.print(integer+" ");
        // }
        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // pass index here, list[index] wont work here 
        }
        // System.out.println(list);
        in.close();
    }
}
