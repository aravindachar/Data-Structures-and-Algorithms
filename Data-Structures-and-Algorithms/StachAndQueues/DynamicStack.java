package StachAndQueues;

/**
 * This is a Dynamic Stack that inherits from CustomStack.
 * The key feature of this stack is that it never gets "full".
 * If the internal array runs out of space, it automatically creates a new, larger array
 * and copies the old elements over.
 */
public class DynamicStack extends CustomStack {

    // --- Constructors ---

    /**
     * Default constructor.
     * It calls the default constructor of the parent class (CustomStack).
     */
    public DynamicStack() {
        // 'super()' calls the constructor of the parent class.
        // In this case, it calls 'public CustomStack()', which initializes the stack with DEFAULT_SIZE.
        super();
    }

    
    /**
     * Parameterized constructor.
     * It calls the parameterized constructor of the parent class (CustomStack).
     * @param size The initial size of the stack.
     */
    public DynamicStack(int size) {
        // 'super(size)' calls the parent constructor 'public CustomStack(int size)'.
        super(size);
    }

    /**
     * Overrides the parent's push method to add dynamic resizing.
     * @param item The integer value to be added to the stack.
     * @return always returns 'true' because the push will always succeed.
     */
    @Override // The @Override annotation tells the compiler we intend to replace the parent's method.
    public boolean push(int item) {

        // Check if the stack is full using the isFull() method inherited from CustomStack.
        if (this.isFull()) {
            // If it is full, we need to resize the array.

            // 1. Create a new temporary array, typically double the size of the original.
            int[] temp = new int[data.length * 2];

            // 2. Copy all elements from the old 'data' array to the new 'temp' array.
            // *** CRITICAL BUG FIX ***
            // Your original loop was 'for(int i = 0 ; i < data.length-1 ; i++)'.
            // This would miss the VERY LAST element of the full stack.
            // The loop must go up to 'data.length' to copy all items.
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            // 3. Make the 'data' reference (from the parent class) point to our new, larger array.
            // The old, smaller array is now eligible for garbage collection.
            data = temp;
        }

        // 4. Now that we have guaranteed there is space, we can call the original parent's push method.
        // 'super.push(item)' will handle the actual insertion of the item and incrementing the pointer.
        // This is a great way to reuse code without repeating logic.
        return super.push(item);
    }

    /*
     * NOTE ON PEEK METHOD:
     * The `peek()` method you had in your code was not a valid override and was unnecessary.
     * Because DynamicStack `extends` CustomStack, it automatically INHERITS the working `peek()` method
     * from the parent. There is no need to write it again. We can simply remove it.
     */
    
}