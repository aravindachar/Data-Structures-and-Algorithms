package StachAndQueues;

import java.util.* ;
public class InBuiltExamples {

    public static void main(String[] args) {

        // --- STACK ---
        // A Stack is a LIFO (Last-In, First-Out) data structure.
        // Think of a stack of plates: you add (push) to the top and remove (pop) from the top.
        // NOTE: While Stack class works, the modern approach is to use a Deque (like ArrayDeque).
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack. 18 is the last one in, so it's at the top.
        stack.push(34); // Bottom -> [34]
        stack.push(45); //         [34, 45]
        stack.push(2);  //         [34, 45, 2]
        stack.push(9);  //         [34, 45, 2, 9]
        stack.push(18); // Top   -> [34, 45, 2, 9, 18]

        System.out.println("--- Popping from Stack ---");
        // Popping removes the top element and returns it.
        System.out.println(stack.pop()); // Removes and prints 18. Stack: [34, 45, 2, 9]
        System.out.println(stack.pop()); // Removes and prints 9.  Stack: [34, 45, 2]
        System.out.println(stack.pop()); // Removes and prints 2.  Stack: [34, 45]
        System.out.println(stack.pop()); // Removes and prints 45. Stack: [34]
        System.out.println(stack.pop()); // Removes and prints 34. Stack: [] (Now empty)

        // DANGER! The next line will cause a runtime error.
        // You cannot .pop() from an empty stack.
        // This will throw an 'EmptyStackException'.
        // Always check if a stack is empty before popping: if (!stack.isEmpty()) { stack.pop(); }
        // System.out.println(stack.pop()); // This line would crash the program.


        System.out.println("\n--- Removing from Queue ---");
        // --- QUEUE ---
        // A Queue is a FIFO (First-In, First-Out) data structure.
        // Think of a line at a ticket counter: the first person in line is the first one served.
        // 'Queue' is an interface, so we need a concrete class like 'LinkedList' or 'ArrayDeque' to create an object.
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue. 'add' inserts at the tail (end) of the queue.
        queue.add(3);  // Front -> [3] <- Tail
        queue.add(6);  //         [3, 6]
        queue.add(5);  //         [3, 6, 5]
        queue.add(19); //         [3, 6, 5, 19]
        queue.add(1);  //         [3, 6, 5, 19, 1]

        // 'remove' retrieves and removes the head (front) of the queue.
        System.out.println(queue.remove()); // Removes and prints 3. Queue: [6, 5, 19, 1]
        System.out.println(queue.remove()); // Removes and prints 6. Queue: [5, 19, 1]


        System.out.println("\n--- Working with Deque ---");
        // --- DEQUE ---
        // A Deque (pronounced "deck") is a Double-Ended Queue.
        // You can add or remove elements from BOTH the front and the back.
        // This makes it perfect for implementing both stacks and queues.
        // 'ArrayDeque' is the recommended implementation for both stacks and queues.
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements
        deque.add(89);      // Adds to the end. Deque: [89]
        deque.addLast(78);  // Explicitly adds to the end. Deque: [89, 78]
        deque.addFirst(10); // Adds to the front. Deque: [10, 89, 78]

        System.out.println("Deque state: " + deque);

        // Removing elements
        System.out.println("Removed first: " + deque.removeFirst()); // Removes and prints 10. Deque: [89, 78]
        System.out.println("Removed last: " + deque.removeLast());   // Removes and prints 78. Deque: [89]
        
        System.out.println("Final deque state: " + deque);
    }
}