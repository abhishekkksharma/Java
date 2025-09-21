package OOP.Inheritance;

public class Box {
    double l;
    double h;
    double w;
    // double height;
    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    //creating a cube:
    Box( double side){
        this.h=side;
        this.l=side;
        this.w=side;
    }
    Box(double l,double h, double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    Box( Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void information(){
        System.out.println("Running the box");
    }

}
