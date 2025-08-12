package Queue_Java;

/**
 * A simple implementation of a Queue using a standard array.
 * Note: This implementation uses a linear shift for the remove operation,
 * which is simple to understand but less efficient than a circular queue.
 */
public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10; // Standard Java convention is to use UPPER_SNAKE_CASE for constants.

    // 'end' acts as a pointer to the next available spot at the rear of the queue.
    // It also conveniently represents the current number of items in the queue.
    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    /**
     * Inserts an item at the rear of the queue.
     * Time Complexity: O(1) - Very efficient.
     * @param item The integer to be added.
     * @return true if insertion is successful, false if the queue is full.
     */
    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return false;
        }
        // Place the item at the end and then increment the end pointer.
        data[end++] = item;
        return true;
    }

    /**
     * Removes and returns the item from the front of the queue.
     * --- PERFORMANCE NOTE ---
     * Time Complexity: O(n) - This is inefficient.
     * On every removal, this method shifts all subsequent elements one position to the left.
     * For a large queue, this can be very slow.
     * @return The removed integer.
     * @throws QueueException if the queue is empty.
     */
    public int remove() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("The queue is empty");
        }
        // The item to be removed is always at the front (index 0).
        int removed = data[0];

        // *** CRITICAL BUG FIX ***
        // The loop now starts from i = 1. Your original code started from i = 0,
        // which caused an 'ArrayIndexOutOfBoundsException' because data[i-1] became data[-1].
        // This loop shifts all elements from index 1 to the end, one step to the left.
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }

        // Decrement the size of the queue.
        end--;
        return removed;
    }

    /**
     * Gets the item at the front of the queue without removing it.
     * Time Complexity: O(1) - Very efficient.
     * @return The item at the front.
     * @throws QueueException if the queue is empty.
     */
    public int front() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("The queue is empty");
        }
        return data[0];
    }

    /**
     * Displays all the elements currently in the queue.
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
    
    /**
     * Checks if the queue is full.
     * @return true if the number of elements has reached the array's capacity.
     */
    public boolean isFull() {
        return end == data.length;
    }

    /**
     * Checks if the queue is empty.
     * @return true if there are no elements in the queue.
     */
    public boolean isEmpty() {
        return end == 0;
    }
}