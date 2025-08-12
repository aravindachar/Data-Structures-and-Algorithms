package Queue_Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Simple Queue Demo ---");
        // We will use a try-catch block to handle potential QueueExceptions
        try {
            CustomQueue queue = new CustomQueue(6);

            // Display the initial empty queue
            System.out.println("\nInitial State:");
            queue.display();

            // Insert 5 items into the queue
            System.out.println("\nInserting 5 items...");
            queue.insert(23);
            queue.insert(33);
            queue.insert(43);
            queue.insert(53);
            queue.insert(63);
            queue.display();

            // Remove the first two items
            System.out.println("\nRemoving 2 items...");
            System.out.println("Removed: " + queue.remove());
            System.out.println("Removed: " + queue.remove());
            queue.display();

            // Look at the new front item
            System.out.println("\nPeeking at the front item...");
            System.out.println("Front item is: " + queue.front());
            
        } catch (QueueException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}