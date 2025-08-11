/**
 * Represents a Circular Linked List (CLL).
 * In a CLL, the 'next' pointer of the last node (tail) points back to the first node (head),
 * forming a circle. This class provides basic operations like adding and deleting nodes.
 */
public class CLL {

    // 'head' points to the first node in the list.
    private Node head;
    // 'tail' points to the last node in the list.
    private Node tail;
    // 'size' tracks the total number of nodes in the list.
    private int size;

    /**
     * Constructor for the CLL class.
     * Initializes an empty list where size is 0, and head/tail are null.
     */
    public CLL() {
        this.size = 0;
    }

    /**
     * Adds a new node with the given value to the front (head) of the list.
     * @param value The integer value for the new node.
     */
    public void addfirst(int value) {
        // Create the new node to be added.
        Node node = new Node(value);

        // Case 1: The list is currently empty.
        if (head == null) {
            head = node;
            tail = node;
            node.next = head; // The node points to itself to form the circle.
        } 
        // Case 2: The list is not empty.
        else {
            node.next = head;   // New node points to the current head.
            head = node;        // The new node becomes the new head.
            tail.next = head;   // The tail must now point to the new head to maintain the circle.
        }
        
        // Increment the size of the list in all cases.
        size++;
    }

    /**
     * Adds a new node with the given value to the end (tail) of the list.
     * @param value The integer value for the new node.
     */
    public void addlast(int value) {
        // If the list is empty, adding last is the same as adding first.
        if (head == null) {
            addfirst(value);
            return;
        }

        // Create the new node.
        Node node = new Node(value);
        tail.next = node;   // The current tail points to the new node.
        node.next = head;   // The new node points back to the head to complete the circle.
        tail = node;        // The new node becomes the new tail.
        size++;
    }

    /**
     * Removes the first node (head) from the list and prints its value.
     */
    public void deletefirst() {
        if (size == 0) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        
        int val = head.value; // Store the value of the node being deleted.
        
        // Case 1: There is only one node in the list.
        if (size == 1) {
            head = null;
            tail = null;
        } 
        // Case 2: There are multiple nodes in the list.
        else {
            head = head.next;   // Move head to the second node.
            tail.next = head;   // Update the tail to point to the new head.
        }

        size--;
        System.out.println("Deleted value: " + val);
    }

    /**
     * Removes the last node (tail) from the list.
     */
    public void deleteLast() {
        // If the list has 0 or 1 elements, deleting the last is the same as deleting the first.
        if (size <= 1) {
            deletefirst();
            return;
        }

        // To delete the last node, we must find the second-to-last node.
        Node secondLast = head;
        // The loop runs 'size - 2' times to stop at the node just before the tail.
        for (int i = 0; i < size - 2; i++) {
            secondLast = secondLast.next;
        }

        // The second-to-last node becomes the new tail.
        tail = secondLast;
        // The new tail's 'next' pointer is updated to point to the head.
        tail.next = head;
        size--;
    }

    /**
     * Displays all the elements in the circular linked list from head to tail.
     */
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        
        Node temp = head;
        // A do-while loop is perfect for a circular list because it executes the body
        // at least once before checking the condition. This allows us to print the head node.
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while (temp != head); // The loop continues until it has circled back to the head.
        
        System.out.println("HEAD (size: " + size + ")");
    }

    /**
     * Private inner class representing a single node in the list.
     * It is private because it's an implementation detail that code outside the CLL class
     * doesn't need to know about.
     */
    private class Node {
        int value;
        Node next;

        /**
         * Constructor for a Node, taking its integer value.
         * @param value The value to be stored in the node.
         */
        private Node(int value) {
            this.value = value;
        }
    }
}