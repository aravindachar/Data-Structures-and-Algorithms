package InterFaces;

// This class 'implements' the Engine interface. It provides a specific implementation for a power engine.
public class PowerEnginen implements Engine {
    
    // This is the PowerEnginen's specific way of starting.
    public void start(){
        System.out.println("power engine start");
    }

    // The @Override annotation is good practice. It tells the compiler you intend to override a method
    // from the interface. If you make a typo, the compiler will give you an error.
    @Override
    public void stop() {
        System.out.println("Power engine stop");
    }

    @Override
    public void acc() {
        System.out.println("power engine stop!!"); // Note: The output text seems to be a typo, probably should be "accelerate".
    }
}