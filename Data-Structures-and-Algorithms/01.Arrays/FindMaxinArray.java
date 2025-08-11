/**22222222
 * ===================================================================================
 * DSA REPOSITORY: FINDING THE MAXIMUM VALUE IN AN ARRAY
 * ===================================================================================
 *
 * This class demonstrates how to find the largest element in an array.
 * It includes two common scenarios:
 * 1. Finding the max value in the entire array.
 * 2. Finding the max value within a specific index range.
 */
public class FindMaxinArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};

        // Example 1: Find the maximum value in the whole array.
        System.out.println("Maximum value in the entire array is: " + max(arr));

        // Example 2: Find the maximum value between index 1 and 3.
        System.out.println("Maximum value between index 1 and 3 is: " + maxRange(arr, 1, 3));
    }

    /**
     * Finds the maximum value in the entire array.
     * @param arr The input array.
     * @return The maximum value, or -1 if the array is empty.
     */
    static int max(int[] arr) {
        // Edge Case: What if the array is empty?
        if (arr == null || arr.length == 0) {
            System.out.println("Error: Array is null or empty.");
            return -1; // Or throw an exception for better error handling.
        }

        // Assume the first element is the maximum.
        int maxVal = arr[0];
        // Iterate from the second element to the end.
        for (int i = 1; i < arr.length; i++) {
            // If we find an element greater than our current max, update the max.
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    /**
     * Finds the maximum value in a given range of indices.
     * @param arr The input array.
     * @param start The starting index of the range (inclusive).
     * @param end The ending index of the range (inclusive).
     * @return The maximum value in the range, or -1 on error.
     */
    static int maxRange(int[] arr, int start, int end) {
        // Edge Cases for the range and array.
        if (arr == null) {
            System.out.println("Error: Array cannot be null.");
            return -1;
        }
        if (start > end) {
            System.out.println("Error: Start index cannot be greater than end index.");
            return -1;
        }

        // Assume the first element of the range is the maximum.
        int maxVal = arr[start];
        // Iterate through the specified range.
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}