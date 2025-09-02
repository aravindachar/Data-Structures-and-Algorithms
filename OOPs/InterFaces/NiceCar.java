package InterFaces;

// This class demonstrates composition. It HAS-A Engine and HAS-A Media player.
// It doesn't implement the interfaces itself but uses objects that do.
public class NiceCar {
    // A private variable to hold any object that implements the Engine interface.
    private Engine engine; 
    
    // A private variable to hold a media player. It's initialized with a CDplayer.
    private Media player = new CDplayer();

    // This is the default constructor. When a NiceCar is created without specifying an engine,
    // it gets a PowerEnginen by default.
    public NiceCar(){
        engine = new PowerEnginen();
    }

    // This is an overloaded constructor. It allows creating a NiceCar with a specific engine
    // (e.g., you could pass an ElectricEngine when creating it).
    public NiceCar(Engine engine){
        this.engine = engine;
    }

    // This method delegates the 'start' action to whatever engine object is currently stored.
    public void start(){
        engine.start();
    }

    // This method delegates the 'stop' action to the current engine.
    public void stop(){
        engine.stop();
    }

    // This method delegates the 'start' action to the media player object.
    public void startMusic(){
        player.start();
    }

    // This method delegates the 'stop' action to the media player object.
    public void stopMusic(){
        player.stop();
    }

    // This method demonstrates the flexibility of interfaces.
    // You can swap out the engine at runtime.
    public void upgradeEngine(){
        // The car's engine is replaced with a new ElectricEngine.
        this.engine = new ElectricEngine();
    }
}