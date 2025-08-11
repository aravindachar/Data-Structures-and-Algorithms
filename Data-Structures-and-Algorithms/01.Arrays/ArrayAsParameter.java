import java.util.Arrays;

/**666666666666666666666666
 * ===================================================================================
 * DSA REPOSITORY: PASSING ARRAYS TO FUNCTIONS
 * ===================================================================================
 *
 * CRITICAL CONCEPT: Mutability of Arrays.
 *
 * In Java, everything is "pass-by-value". However, for objects (including arrays), the
 * "value" that gets passed is the REFERENCE (memory address) to the object.
 *
 * What this means:
 * - A copy of the reference is passed to the function.
 * - Both the original reference (in main) and the copied reference (in the function)
 * point to the EXACT SAME array object in the heap memory.
 * - Therefore, if the function modifies the array, the changes will be visible
 * to the original reference in the calling function. This is called a "side effect".
 * - In simple terms, arrays are MUTABLE (changeable) when passed to functions.
 */
public class ArrayAsParameter {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 12};

        System.out.println("Array BEFORE calling the change() function: " + Arrays.toString(nums));

        // We pass the array to the 'change' function.
        change(nums);

        // Observe that the original 'nums' array has been modified.
        System.out.println("Array AFTER calling the change() function:  " + Arrays.toString(nums));
    }

    /**
     * This function takes an array reference and modifies the element at index 0.
     * @param arr The reference to the array to be modified.
     */
    static void change(int[] arr) {
        System.out.println("... Inside change() function: Modifying the array ... ");
        // This modification will affect the original array object.
        arr[0] = 99;
    }
}