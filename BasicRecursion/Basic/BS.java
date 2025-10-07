public class BS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 2;
        int result = search(arr, target, 0, arr.length - 1);
        
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    /**
     * Performs a recursive binary search on a sorted array.
     * @param arr The sorted array to search in.
     * @param target The element to search for.
     * @param s The starting index of the search space.
     * @param e The ending index of the search space.
     * @return The index of the target element, or -1 if not found.
     */
    static int search(int[] arr, int target, int s, int e) {
        // Base case: If the start index crosses the end index, the element is not present.
        if (s > e) {
            return -1;
        }

        // CORRECTED: Calculate the middle index of the current search space.
        int m = s + (e - s) / 2;

        // If the middle element is the target, we found it.
        if (arr[m] == target) {
            return m;
        }

        // CORRECTED: If the target is greater than the middle element,
        // it must be in the right half of the array.
        if (arr[m] < target) {
            return search(arr, target, m + 1, e); // Search right half
        }

        // CORRECTED: If the target is smaller than the middle element,
        // it must be in the left half of the array.
        return search(arr, target, s, m - 1); // Search left half
    }
}