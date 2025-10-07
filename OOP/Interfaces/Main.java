package OOP.Interfaces;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();

        // car.start();
        // // car.acc();
        // // car.stop();

        // //not to do - media object can not be created because it is a interface not a class
        // Media carMedia = new Car();
        // carMedia.stop();


        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
