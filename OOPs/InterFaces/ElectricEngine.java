package InterFaces;

// This is another implementation of the Engine interface, this time for an electric engine.
public class ElectricEngine implements Engine{
    
    // This is the ElectricEngine's specific way of starting.
    public void start(){
        System.out.println("the electic enginen start");
    }

    // The ElectricEngine's specific way of stopping.
    public void stop(){
        System.out.println("the car electic enigne will stop");
    }

    // The ElectricEngine's specific way of accelerating.
    public void acc(){
        System.out.println("the electric engineen accelrates");
    }
}