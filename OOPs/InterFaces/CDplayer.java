package InterFaces;

// This class implements the Media interface. It provides a specific implementation for a CD player.
public class CDplayer implements Media {
    
    // The CDplayer's implementation of the start() method.
    public void start(){
        System.out.println("this CD player START implemeted from MEdia");
    }
    
    // The CDplayer's implementation of the stop() method.
    public void stop(){
        System.out.println("this CD player STOP implemeted from MEdia");
    }
}