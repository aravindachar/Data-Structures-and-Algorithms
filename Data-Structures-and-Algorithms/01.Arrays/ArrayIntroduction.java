/**!!!!!111111111
 * ===================================================================================
 * DSA REPOSITORY: INTRODUCTION TO ARRAYS
 * ===================================================================================
 *
 * Q: Why do we need arrays?
 * A: To store a collection of multiple values of the same data type under a single variable name.
 * Without arrays, storing 5 roll numbers would require 5 separate variables. With an array,
 * we can store all 5 in one variable.
 *
 * An array is a data structure that stores a collection of items in contiguous memory locations.
 *
 * Key Concepts:
 * - Declaration: Telling the compiler about the variable's name and type. (e.g., int[] numbers;)
 * - Instantiation: Creating the actual object in memory (heap). This is where the size is set. (e.g., new int[5];)
 * - Initialization: Putting values into the array.
 * - Primitives (like int, char) are stored directly in the array's memory block.
 * - Objects (like String) have their references stored in the array, and the actual objects are elsewhere in the heap.
 */
public class ArrayIntroduction {
    public static void main(String[] args) {

        // ======================= Syntax =======================
        // datatype[] variableName = new datatype[size];
        // ======================================================

        // Declaration: 'rnos' is a reference variable in the stack.
        int[] rnos;
        // Instantiation: The actual array object is created in the heap memory.
        rnos = new int[5]; // Creates an integer array of size 5.

        // By default, an integer array is initialized with all zeros.
        System.out.println("Default value of an element in an int array: " + rnos[1]); // Output: 0

        // You can also declare and initialize in one line.
        int[] rnos2 = {23, 12, 45, 32, 15}; // Values are provided directly.

        // --- Working with a String array ---
        // Declaration and instantiation for an array of objects (String).
        String[] arr = new String[4];

        // By default, a String array (or any object array) is initialized with 'null'.
        // 'null' is a special literal that means the reference variable points to nothing.
        System.out.println("Default value of an element in a String array: " + arr[0]); // Output: null
    }
}