import java.util.Arrays;
import java.util.Scanner;

/**333333333
 * ===================================================================================
 * DSA REPOSITORY: 2D ARRAYS (MATRICES)
 * ===================================================================================
 *
 * A 2D array is essentially an "array of arrays". You can think of it as a grid or a matrix.
 *
 * Key Concepts:
 * - Each element in the main array is itself another array.
 * - `arr.length` gives the number of rows.
 * - `arr[row].length` gives the number of columns in a specific row.
 * - It's not mandatory for all rows to have the same number of columns. This is called a "jagged array".
 */
public class MultiDimArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // --- Initialization ---

        // Method 1: Fixed-size 2D array (e.g., a 3x3 matrix)
        int[][] arr = new int[3][3];

        // Method 2: Jagged array (rows have different numbers of columns)
        int[][] jaggedArr = {
                {1, 2, 3},    // 0th row has 3 columns
                {4, 5},       // 1st row has 2 columns
                {6, 7, 8, 9}  // 2nd row has 4 columns
        };

        // --- Taking Input for a 3x3 Matrix ---
        System.out.println("Enter 9 elements for the 3x3 matrix:");
        // The outer loop iterates through the rows.
        for (int row = 0; row < arr.length; row++) {
            // The inner loop iterates through the columns of the current row.
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // --- Printing the 2D Array ---
        System.out.println("\nPrinting the matrix in different ways:");

        // Method A: Using nested standard for loops.
        System.out.println("\nMethod A: Nested for loops");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // New line after each row
        }

        // Method B: Using Arrays.toString() for each row.
        System.out.println("\nMethod B: Using Arrays.toString()");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // Method C: Using an enhanced for loop (cleanest way).
        System.out.println("\nMethod C: Enhanced for loop (cleanest)");
        for (int[] rowArray : arr) { // Each element of 'arr' is an integer array (a row).
            System.out.println(Arrays.toString(rowArray));
        }
    }
}