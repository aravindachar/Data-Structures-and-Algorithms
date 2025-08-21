/**
 * Box.java - The Parent (Superclass)
 * This class defines the fundamental properties of a box: length, width, and height.
 * It serves as the base for all other specialized box types.
 */
public class Box {
    // These are the instance variables. Every Box object will have its own copy of these.
    double l;
    double w;
    double h;

    /**
     * Default Constructor:
     * Used when a Box is created without any dimensions.
     * It initializes the dimensions to -1 to indicate they are not set.
     */
    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    /**
     * Parameterized Constructor:
     * Used to create a Box with specific dimensions.
     * 'this.l' refers to the instance variable, while 'l' refers to the parameter.
     */
    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box(double l ){
        this.l = l ;
    }
    /**
     * Copy Constructor:
     * Creates a new Box object that is a copy of an existing Box object.
     */
    Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    /**
     * A simple method to display some information.
     */
    public void information() {
        System.out.println("Running from the Box class.");
    }
    public static void main(String[] args) {

    }
}
