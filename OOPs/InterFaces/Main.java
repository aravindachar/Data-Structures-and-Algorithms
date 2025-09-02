package InterFaces;

public class Main {
    // This is the main entry point of your program.
    public static void main(String[] args) {
        
        // 1. Create a new instance of NiceCar.
        // The default constructor is used, so it will have a 'PowerEnginen' inside.
        NiceCar car = new NiceCar();

        // 2. Call the start() method on the 'car' object.
        // This will call the start() method of its current engine, which is 'PowerEnginen'.
        car.start(); // EXPECTED OUTPUT: "power engine start"

        // 3. Call the startMusic() method.
        // This will call the start() method of its 'player', which is a 'CDplayer'.
        car.startMusic(); // EXPECTED OUTPUT: "this CD player START implemeted from MEdia"

        // 4. Call the upgradeEngine() method.
        // This replaces the internal 'PowerEnginen' object with a new 'ElectricEngine' object.
        car.upgradeEngine() ;

        // 5. Call the start() method on the 'car' object again.
        // This time, it will call the start() method of the new 'ElectricEngine'.
        // This demonstrates polymorphism - the same method call car.start() does something different.
        car.start(); // EXPECTED OUTPUT: "the electic enginen start"
    }
}