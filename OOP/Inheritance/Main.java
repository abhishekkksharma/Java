package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box1 = new Box(5, 3, 6);
        // System.out.println(box1.l + " "+ box1.h +" " + box1.w);

        Boxweight boxw = new Boxweight();
        Boxweight boxw2 = new Boxweight();
        Boxweight boxw3 = new Boxweight(1,2,3,4);
        System.out.println(boxw2.w);
        System.out.println(boxw.h + " " + boxw.weight);
        System.out.println(boxw3.l + " " + boxw3.h + " " + boxw3.w + " " + boxw3.weight);
        // System.out.println(boxw3.height); // using super keyword we are calling the value of hieght in Boxweight from Box
    }
}
