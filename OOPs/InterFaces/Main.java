package InterFaces;

public class Main {
    // interfaces are by default final and public 
    public static void main(String[] args) {
        Car car = new Car();
        car.acc();
        car.start();
        Engine Ecar = new ElectricEngine();
        Ecar.acc();
        
    }
}
