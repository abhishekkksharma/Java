package OOP.Inheritance;

public class Boxweight extends Box {
    double weight;
    public Boxweight(){
        this.weight=-1;
    }
    Boxweight(double l,double h, double w,double weight ){
        // this.l=l;
        // this.h=h;
        // this.w=w;
        //or -> this works the same using the parent class consturctor
        super(l,w,h); // uses the upper Class constructor 
        // System.out.println(super.height); //using super keyword we are calling the value of hieght in Boxweight from Box
        this.weight=weight;
    }
}
