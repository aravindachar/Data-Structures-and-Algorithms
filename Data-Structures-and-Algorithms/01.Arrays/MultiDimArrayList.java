import java.util.ArrayList;
import java.util.Scanner;

/**5555555555555555
 * ===================================================================================
 * DSA REPOSITORY: 2D ArrayList
 * ===================================================================================
 *
 * A 2D ArrayList is an ArrayList where each element is another ArrayList.
 * This is useful when you need a dynamic 2D data structure where both the number
 * of rows and the number of columns can change during runtime.
 */
public class MultiDimArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declaration of a 2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // --- Initialization ---
        // Before you can add elements to the inner lists, you must first create them.
        // Here, we'll initialize 3 empty inner lists (rows).
        System.out.println("Initializing 3 rows in the 2D ArrayList...");
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // --- Adding Elements ---
        // Now we can add elements to the inner lists.
        System.out.println("Enter 9 numbers to populate the 3x3 list:");
        for (int i = 0; i < 3; i++) { // Loop for the rows
            for (int j = 0; j < 3; j++) { // Loop for the columns
                // list.get(i) gets the inner ArrayList at row 'i'.
                // .add() then adds an element to that inner list.
                list.get(i).add(in.nextInt());
            }
        }

        // --- Printing the 2D ArrayList ---
        // ArrayList has a convenient default toString() method for printing.
        System.out.println("\nThe final 2D ArrayList is:");
        System.out.println(list);
    }
}