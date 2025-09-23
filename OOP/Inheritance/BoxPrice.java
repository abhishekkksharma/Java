package OOP.Inheritance;

public class BoxPrice extends Boxweight {
    double cost;
    BoxPrice(){
        super();
        cost = -1;
    }
    BoxPrice(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);  
        this.cost = cost;
    }
    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }
    public BoxPrice(double side, double weight, double cost){
        super(side, weight);
        this.cost = cost;
    }
}
