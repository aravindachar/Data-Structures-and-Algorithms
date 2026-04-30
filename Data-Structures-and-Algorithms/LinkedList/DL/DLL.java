package DL;

public class DLL {
    // Head of the doubly linked list. This points to the first node.
    private Node head;
    // Tail of the doubly linked list. This points to the last node.
    // Having a tail pointer makes insertion at the end O(1).
    private Node tail;
    // Keeps track of the number of elements in the list.
    private int size;

    // Constructor for the DLL class.
    public DLL() {
        this.size = 0; // Initialize size to 0 when a new list is created.
    }

    // --- Inner Node Class ---
    // This private inner class defines the structure of each node in the DLL.
    private class Node {
        private int value;  // The data stored in the node.
        private Node next;  // Reference to the next node in the list.
        private Node prev;  // Reference to the previous node in the list.

        // Constructor for a new node with only a value.
        // The 'next' and 'prev' references will be null by default.
        public Node(int value) {
            this.value = value;
        }

        // Constructor for a new node with a value, and references to the next and previous nodes.
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    // --- Core Operations for Doubly Linked List ---

    // 1. Insert an element at the beginning of the list.
    public void insertFirst(int val) {
        Node node = new Node(val); // Create a new node with the given value.

        if (head == null) {
            // If the list is empty, the new node becomes both the head and the tail.
            head = node;
            tail = node;
        } else {
            // If the list is not empty:
            node.next = head;     // The new node's 'next' points to the current head.
            head.prev = node;     // The current head's 'prev' points to the new node.
            head = node;          // Update the head of the list to be the new node.
        }
        size++; // Increment the size of the list.
    }

    // 2. Insert an element at the end of the list.
    public void insertLast(int val) {
        // If the list is empty, inserting at the end is the same as inserting at the beginning.
        if (head == null) {
            insertFirst(val); // Reuse the insertFirst logic.
            return;
        }
        Node node = new Node(val); // Create a new node.
        tail.next = node;          // The current tail's 'next' points to the new node.
        node.prev = tail;          // The new node's 'prev' points to the current tail.
        tail = node;               // Update the tail of the list to be the new node.
        size++;                    // Increment the size of the list.
    }

    // 3. Insert an element at a specific index.
    public int insert(int val, int index) {
        // Handle edge cases:
        if (index == 0) {
            insertFirst(val); // If index is 0, insert at the beginning.
            return 1;
        }
        // Corrected: Insert at the end if index is equal to the current size
        if (index == size) { // If index is 'size', it means inserting after the last element.
            insertLast(val);
            return 1;
        }
        // Handle invalid index that is out of bounds.
        if (index < 0 || index > size) {
            System.out.println("The index is out of boundary.");
            return -1;
        }
        // General case: Insert in the middle of the list.
        else {
            // Traverse to the node *before* the insertion point.
            // Start 'temp' at the head.
            Node temp = head;
            // The loop runs 'index - 1' times to reach the node just before the target index.
            // Example: To insert at index 2, we need 'temp' to be at index 1.
            // Loop runs for i = 0 (temp = head.next), so temp is at index 1.
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            // At this point, 'temp' is the node that will be *before* the new node.
            // 'temp.next' is the node that will be *after* the new node.

            // Create the new node with its next pointing to temp.next and prev pointing to temp.
            Node node = new Node(val, temp.next, temp);

            // Update the 'prev' pointer of the node that was originally after 'temp'.
            temp.next.prev = node;
            // Update the 'next' pointer of 'temp' to point to the new node.
            temp.next = node;
            size++; // Increment the size.
        }
        return 1; // Indicate successful insertion.
    }

    // 4. Delete the element from the beginning of the list.
    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is empty, cannot delete.");
            return -1; // Indicate error or throw an exception.
        }

        int val = head.value; // Store the value of the head node to return.

        if (head == tail) {
            // If there's only one node in the list, after deletion, the list becomes empty.
            head = null;
            tail = null;
        } else {
            // If there are multiple nodes:
            head = head.next; // Move head to the next node.
            if (head != null) {
                // If the new head exists (i.e., list wasn't just a single node),
                // set its 'prev' to null as it's now the first node.
                head.prev = null;
            }
        }
        size--; // Decrement the size.
        return val; // Return the deleted value.
    }

    // 5. Delete the element from the end of the list.
    public int deleteLast() {
        if (tail == null) {
            System.out.println("List is empty, cannot delete.");
            return -1; // Indicate error or throw an exception.
        }

        int val = tail.value; // Store the value of the tail node to return.

        if (head == tail) {
            // If there's only one node, deletion at end is same as deletion at start.
            return deleteFirst(); // Reuse deleteFirst logic.
        } else {
            // If there are multiple nodes:
            tail = tail.prev;   // Move tail to the previous node.
            tail.next = null;   // The new tail's 'next' should be null.
        }
        size--; // Decrement the size.
        return val; // Return the deleted value.
    }

    // 6. Delete an element at a specific index.
    public int delete(int index) {
        // Handle edge cases:
        if (index == 0) {
            return deleteFirst(); // If index is 0, delete from the beginning.
        }
        if (index == size - 1) {
            return deleteLast();  // If index is last, delete from the end.
        }
        if (index < 0 || index >= size) {
            System.out.println("Invalid index for deletion."); // Handle invalid index.
            return -1; // Indicate error or throw an exception.
        }

        // Traverse to the node *to be deleted*.
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        int val = temp.value; // Store the value of the node to be deleted.

        // Adjust the 'next' pointer of the previous node.
        temp.prev.next = temp.next;
        // Adjust the 'prev' pointer of the next node (if it exists).
        if (temp.next != null) { // This check is important if deleting the node just before tail.
            temp.next.prev = temp.prev;
        }

        size--; // Decrement the size.
        return val; // Return the deleted value.
    }

    // 7. Find a node by its value.
    public Node find(int value) {
        Node node = head; // Start searching from the head.
        while (node != null) {
            if (node.value == value) {
                return node; // Return the node if value is found.
            }
            node = node.next; // Move to the next node.
        }
        return null; // Return null if the value is not found in the list.
    }

    // 8. Display the elements of the list (forward and backward traversal).
    public void display() {
        Node temp = head; // Start from the head for forward traversal.
        System.out.println("\n--- Forward Traversal ---");
        while (temp != null) {
            System.out.print(temp.value + " --> "); // Print current node's value.
            temp = temp.next; // Move to the next node.
        }
        System.out.println("END"); // Mark the end of forward traversal.

        System.out.println("--- Backward Traversal ---");
        Node last = tail; // Start from the tail for backward traversal.
        while (last != null) {
            System.out.print(last.value + " <-- "); // Print current node's value.
            last = last.prev; // Move to the previous node.
        }
        System.out.println("START"); // Mark the start of backward traversal.
    }

    // Get the current size of the list.
    public int getSize() {
        return size;
    }

    // --- Main method for testing the Doubly Linked List ---
   
}