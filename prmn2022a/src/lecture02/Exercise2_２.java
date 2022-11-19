package lecture02;

public class Exercise2_２ {
    public static void main(String[] args) {
        GasStation Gas= new GasStation();
        Car car =new Car();
        car.run();
        Gas.refuel(car);
        car.run();
    }
}
