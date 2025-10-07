package OOP.Interfaces;

public class PowerEngine implements Engine {

    @Override
    public void acc() {
        System.out.println("Power engine accelerated");
    }

    @Override
    public void start() {
        System.out.println("Power engine started");        
    }

    @Override
    public void stop() {
        System.out.println("Power engine stopped");
    }
    
}
