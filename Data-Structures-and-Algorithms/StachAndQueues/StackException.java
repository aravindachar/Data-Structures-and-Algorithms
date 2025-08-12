package StachAndQueues; // Correctly placed in the same package

/**
 * This is a custom exception class designed specifically for our Stack data structures.
 * It inherits from Java's built-in 'Exception' class.
 * Creating a custom exception makes our code cleaner and our error handling more specific.
 * When a method signature says 'throws StackException', the programmer knows exactly what
 * kind of error to expect – one related to a stack operation.
 */
public class StackException extends Exception {

    /**
     * This is the constructor for our custom exception.
     * @param message A descriptive string explaining what went wrong (e.g., "Cannot pop from an empty stack!").
     */
    public StackException(String message) {
        // The 'super(message)' call passes the error message up to the parent 'Exception' class.
        // This allows our custom exception to behave just like a standard Java exception,
        // for example, by using methods like getMessage().
        super(message);
    }
}