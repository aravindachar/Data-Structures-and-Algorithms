/**
 * BoxPrice.java - The Grandchild Class
 * This class extends BoxWeight. This means it inherits everything from BoxWeight,
 * which also includes everything from Box. This is called Multilevel Inheritance.
 * (BoxPrice -> BoxWeight -> Box)
 */
public class BoxPrice extends BoxWeight {
    // This is a new instance variable specific to BoxPrice.
    double price;

    /**
     * Default Constructor
     */
    BoxPrice() {
        super(); // Calls BoxWeight() constructor
        this.price = -1;
    }

    /**
     * Parameterized Constructor:
     * Initializes a fully-featured box with all properties.
     */
    BoxPrice(double l, double w, double h, double weight, double price) {
        // We call the immediate parent's (BoxWeight) constructor to set l, w, h, and weight.
        super(l, w, h, weight);
        
        // Then we set the property specific to this class.
        this.price = price;
    }

    /**
     * Copy Constructor (for demonstration):
     * Creates a new BoxPrice object from an old one.
     */
    BoxPrice(BoxPrice old) {
        super(old.l, old.w, old.h, old.weight); // Pass values to BoxWeight constructor
        this.price = old.price;
    }
}
