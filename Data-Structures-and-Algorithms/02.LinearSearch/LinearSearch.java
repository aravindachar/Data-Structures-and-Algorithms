/**
 * ===================================================================================
 * DSA REPOSITORY: LINEAR SEARCH
 * ===================================================================================
 *
 * Linear Search is the most basic search algorithm. It sequentially checks each
 * element of a list until a match is found or the whole list has been searched.
 *
 * HOW IT WORKS:
 * 1. Start from the leftmost element of the array.
 * 2. Compare the target value with the current element.
 * 3. If they match, return the result (index, value, or true).
 * 4. If they don't match, move to the next element.
 * 5. If the end of the array is reached without finding a match, the search terminates.
 *
 * COMPLEXITY:
 * - Time Complexity: O(n) - In the worst case, we have to scan the entire array.
 * - Space Complexity: O(1) - No extra space is needed.
 *
 * ADVANTAGE:
 * - Simple to implement.
 * - Works on unsorted arrays.
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int notFoundTarget = 99;

        // --- Demonstrate the 3 variations of Linear Search ---

        // 1. Search for the index of the target
        int index = findIndex(nums, target);
        System.out.println("Searching for " + target + ". Found at index: " + index);

        int notFoundIndex = findIndex(nums, notFoundTarget);
        System.out.println("Searching for " + notFoundTarget + ". Found at index: " + notFoundIndex);

        System.out.println("---");

        // 2. Check if the target exists (returns true/false)
        boolean exists = doesExist(nums, target);
        System.out.println("Does the element " + target + " exist in the array? " + exists);

        System.out.println("---");

        // 3. Search for the value itself
        int value = findValue(nums, target);
        // Note: This method is less common. Returning the index or a boolean is standard.
        System.out.println("Searching for and returning the value itself: " + value);
    }

    /**
     * Searches the array for a target and returns its index.
     * @param arr The array to search in.
     * @param target The element to search for.
     * @return The index of the target if found, otherwise -1.
     */
    static int findIndex(int[] arr, int target) {
        // Edge case: if the array is null or empty, it can't contain the target.
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // Iterate through the array from start to end.
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the target.
            if (arr[i] == target) {
                return i; // Target found, return its index.
            }
        }

        // If the loop finishes, the target was not found in the array.
        return -1;
    }

    /**
     * Searches the array for a target and returns a boolean.
     * @param arr The array to search in.
     * @param target The element to search for.
     * @return true if the target is found, otherwise false.
     */
    static boolean doesExist(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        // Using an enhanced for-loop is cleaner if you don't need the index.
        for (int element : arr) {
            if (element == target) {
                return true; // Target found.
            }
        }
        return false; // Target not found.
    }

    /**
     * Searches the array and returns the element itself if found.
     * Note: This is less practical than returning the index.
     * @param arr The array to search in.
     * @param target The element to search for.
     * @return The element if found, otherwise Integer.MAX_VALUE as an indicator.
     */
    static int findValue(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            // Returning a specific value like -1 can be problematic if -1 is a valid element.
            // Using Integer.MAX_VALUE is one way to signal 'not found', but it's not foolproof.
            return Integer.MAX_VALUE;
        }

        for (int element : arr) {
            if (element == target) {
                return element; // Return the actual element.
            }
        }
        return Integer.MAX_VALUE;
    }
}