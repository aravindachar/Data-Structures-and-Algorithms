// Define the package for organizing related classes.
package StachAndQueues;

// First, let's define the custom exception that the stack will use.
// This is good practice for creating specific error types for your data structure.
class StackException extends Exception {
    public StackException(String message) {
        super(message); // Pass the error message to the parent Exception class.
    }
}

// This is your custom implementation of a stack using a simple array.
class CustomStack { // Note: Standard Java naming convention is PascalCase (CustomStack not CustomeStack)

    // The array that will store the stack's elements.
    // 'protected' means it can be accessed by this class and any subclasses.
    protected int[] data;

    // A constant to hold the default size of the stack if no size is specified.
    // 'final' means this value cannot be changed after it's initialized.
    private static final int DEFAULT_SIZE = 10; // Standard naming for constants is UPPER_SNAKE_CASE

    // This is the "pointer" or index that always points to the top element of the stack.
    // We initialize it to -1 to indicate that the stack is initially empty.
    int ptr = -1;

    // Constructor 1: Default constructor.
    // This is called when you create a stack without specifying a size, like: CustomStack stack = new CustomStack();
    public CustomStack() {
        // It creates a new stack with the DEFAULT_SIZE.
        // The 'this()' keyword is used to call another constructor from within a constructor.
        this(DEFAULT_SIZE);
    }

    // Constructor 2: Parameterized constructor.
    // This is called when you want a stack of a specific size, like: CustomStack stack = new CustomStack(5);
    public CustomStack(int size) {
        // It initializes the 'data' array with the given size.
        this.data = new int[size];
    }

    /**
     * Pushes (adds) an item onto the top of the stack.
     * Time Complexity: O(1) - constant time.
     * @param item The integer value to be added to the stack.
     * @return 'true' if the push was successful, 'false' if the stack was full.
     */
    public boolean push(int item) {
        // First, check if the stack is already full.
        if (isFull()) {
            System.out.println("Stack is full! Cannot push item " + item);
            return false;
        }

        // *** CRITICAL FIX EXPLANATION ***
        // In your original code: data[ptr] = item; ptr++;
        // This was incorrect because on the first push, 'ptr' is -1, causing an ArrayIndexOutOfBoundsException.
        // The correct order is to FIRST increment the pointer to point to the next empty spot,
        // and THEN insert the item at that new position.
        ptr++;
        data[ptr] = item;
        return true; // The item was successfully added.
    }

    /**
     * Pops (removes and returns) the item from the top of the stack.
     * Time Complexity: O(1) - constant time.
     * @return The integer value removed from the top of the stack.
     * @throws StackException if you try to pop from an empty stack.
     */
    public int pop() throws StackException {
        // First, check if the stack is empty. You can't remove an item if there are none.
        if (isEmpty()) {
            // If it's empty, throw our custom exception with a helpful message.
            throw new StackException("Cannot pop from an empty stack!");
        }

        // *** LOGIC EXPLANATION ***
        // The post-decrement operator (ptr--) is used here.
        // It does two things in order:
        // 1. It returns the value from the array at the current 'ptr' index.
        // 2. AFTER returning the value, it decrements 'ptr' by 1.
        // This effectively removes the top element and moves the pointer down.
        return data[ptr--];
    }

    /**
     * Peeks at (returns but does not remove) the item at the top of the stack.
     * Time Complexity: O(1) - constant time.
     * @return The integer value at the top of the stack.
     * @throws StackException if you try to peek at an empty stack.
     */
    public int peek() throws StackException {
        // Check if the stack is empty.
        if (isEmpty()) {
            // If so, you can't look at the top element. Throw an exception.
            throw new StackException("Cannot peek into an empty stack!");
        }
        // Simply return the element at the current pointer's position without changing the pointer.
        return data[ptr];
    }

    /**
     * Helper method to check if the stack is full.
     * @return 'true' if the stack is full, 'false' otherwise.
     */
    public boolean isFull() {
        // The stack is full if the pointer has reached the last valid index of the array.
        // Array indices go from 0 to length-1.
        return ptr == data.length - 1;
    }

    /**
     * Helper method to check if the stack is empty.
     * @return 'true' if the stack is empty, 'false' otherwise.
     */

    public boolean isEmpty() {
        // Our convention is that an empty stack has its pointer at -1.
        return ptr == -1;
    }
}