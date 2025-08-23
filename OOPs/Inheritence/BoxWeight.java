/**
 * BoxWeight.java - The Child (Subclass) of Box
 * This class extends Box, so it inherits length, width, and height.
 * It adds a new feature: weight. This is an example of Single Inheritance.
 */
public class BoxWeight extends Box {
    // This is a new instance variable specific to BoxWeight.
    double weight;
    /**
     * Default Constructor:
     * Initializes the weight to a default value.
     * Note: Java automatically calls the parent's default constructor (super()) here.
     */
    BoxWeight() {
        super(); // This calls Box() constructor
        this.weight = -1;
    }

    /**
     * Parameterized Constructor:
     * This is the most important constructor for inheritance.
     * @param l length, to be passed to the parent
     * @param w width, to be passed to the parent
     * @param h height, to be passed to the parent
     * @param weight the new property for this class
     */
    
    BoxWeight(double l, double w, double h, double weight) {
        // The 'super(l, w, h)' call invokes the parent class (Box) constructor.
        // It MUST be the first line in the child constructor.
        // This is how we initialize the inherited properties (l, w, h).
        super(l, w, h);
        
        // Now, we initialize the property that is unique to this child class.
        this.weight = weight;
        

    }
    public void information() {
        System.out.println("Running from the Box class.");
        System.out.println("its overdiden");
    }

}
