/**
 * Main.java - The entry point of our program.
 * We create objects of our classes here to see inheritance in action.
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Creating a simple Box ---");
        Box box = new Box(5, 10, 15);
        System.out.println("Box height: " + box.h);

        System.out.println("\n--- Creating a BoxWeight ---");
        // This object has access to l, w, h from Box, and weight from BoxWeight.
        BoxWeight boxw1 = new BoxWeight(2, 5, 7, 45);
        System.out.println("BoxWeight length: " + boxw1.l);
        System.out.println("BoxWeight weight: " + boxw1.weight);

        System.out.println("\n--- Creating a BoxPrice ---");
        // This object has access to everything from Box, BoxWeight, and BoxPrice.
        BoxPrice boxp1 = new BoxPrice(3, 6, 9, 50, 299.99);
        System.out.println("BoxPrice height: " + boxp1.h); // Inherited from Box
        System.out.println("BoxPrice weight: " + boxp1.weight); // Inherited from BoxWeight
        System.out.println("BoxPrice price: " + boxp1.price); // Its own property

        System.out.println("\n--- Creating a copy of BoxPrice ---");
        BoxPrice boxp2 = new BoxPrice(boxp1);
        System.out.println("Copied BoxPrice price: " + boxp2.price);
    }
}
