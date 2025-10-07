package OOP.Interfaces;

public class Car implements Engine, Brake, Media {
    @Override
    public void brake() {
        System.out.println("Break appliead");        
    }
    @Override
    public void start() {
        System.out.println("Car and engine Started");
    }
    @Override
    public void stop() {
        System.out.println("Car and engine stopped");
    }
    @Override
    public void acc() {
        System.out.println("Car accelerated");
    }
}
