package InterFaces;

// An interface acts as a contract for what a class should do.
// Any class that 'implements' Engine MUST provide code for start(), stop(), and acc().
public interface Engine {
    // Variables in an interface are 'public', 'static', and 'final' by default.
    // This means they are constants and belong to the interface itself, not to any object.
    int a = 100;

    // Defines a method 'start'. Classes implementing this must define how their engine starts.
    void start();

    // Defines a method 'stop'. Classes implementing this must define how their engine stops.
    void stop();

    // Defines a method 'acc' (accelerate). Classes implementing this must define how their engine accelerates.
    void acc();
    // In your Engine.java interface
     default void checkStatus() {
        System.out.println("Engine status is OK.");
    }
}